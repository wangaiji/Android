package com.example.lenovo.iciba;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.lenovo.iciba.db.Word;
import com.example.lenovo.iciba.gson.Associate;
import com.example.lenovo.iciba.gson.Paraphrase;
import com.example.lenovo.iciba.util.HttpUtil;
import com.example.lenovo.iciba.util.Utility;

import org.litepal.crud.DataSupport;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.Callback;

import okhttp3.Response;

public class ListActivity extends AppCompatActivity {
    private SearchView searchView;
    private Button button;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();
    private String selectedAssociate1;
    private String selectedAssociate2;
    private List<Associate.DataBean> dataBeans;
    private List<Word> wordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        searchView = findViewById(R.id.searchView);
        button = findViewById(R.id.clear);
        adapter = new ArrayAdapter<>(ListActivity.this,android.R.layout.simple_list_item_1,dataList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        if (searchView != null) {
            try {        //--拿到字节码
                Class<?> argClass = searchView.getClass();
                //--指定某个私有属性,mSearchPlate是搜索框父布局的名字
                Field ownField = argClass.getDeclaredField("mSearchPlate");
                //--暴力反射,只有暴力反射才能拿到私有属性
                ownField.setAccessible(true);
                View mView = (View) ownField.get(searchView);
                //--设置背景
                mView.setBackgroundResource(R.drawable.searchview_line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        //设置搜索文本监听
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            //当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            //当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)) {
                    dataList.clear();
                    Log.d("23456","1");
                    Log.d("23456",newText);
                    requestAssociate(newText);
                    button.setVisibility(View.INVISIBLE);
                } else {
                    List = DataSupport.findAll(Word.class);
                    if (wordList.size()>0) {
                        dataList.clear();
                        for (Word word:wordList) {
                            dataList.add(paraphrase.getSimple().getQuery());
                        }
                    }
                    button.setVisibility(View.VISIBLE);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dataList.clear();
                        }
                    });
                }
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedAssociate1 = dataList.get(i).toString().substring(0,dataList.get(i).toString().indexOf(' '));
                selectedAssociate2 = dataList.get(i).toString().substring(dataList.get(i).toString().indexOf(' '),dataList.get(i).toString().indexOf(';'));
                Intent  intent = new Intent();
                intent.putExtra("data_return1",selectedAssociate1);
                intent.putExtra("data_return2",selectedAssociate2);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
String string;
    public void requestAssociate(final String wordFirst) {
        string = wordFirst;
        String associateUrl = "http://dict.youdao.com/suggest?q=" + wordFirst + "&le=eng&num=80&ver=&doctype=json&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&abtest=";



        HttpUtil.sendOkHttpRequest(associateUrl, new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("369","失败");
                        Toast.makeText(ListActivity.this, "获取单词失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(okhttp3.Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final Associate associate = Utility.handleAssociateResponse(responseText);
                Log.d("1234","1"+responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (associate != null && 200 == associate.getResult().getCode() && "success".equals(associate.getResult().getMsg())) {
                            Log.d("1234","2");
                            Log.d("345678",associate.toString());
                            dataList.clear();
                            showAssociate(associate);
                        }
                    }
                });
            }


            //展示数据
            public void showAssociate(Associate associate) {
                Log.d("3456","2");
                for (Associate.DataBean.EntriesBean entriesBean : associate.getData().getEntries()) {
                    Log.d("3456","3");
                    String text = entriesBean.getEntry() + "  " + entriesBean.getExplain() + ";";
                    Log.d("3456","text");
                    dataList.add(text);
                }
                adapter.notifyDataSetChanged();
                listView.setSelection(0);

//
//                adapter = new ArrayAdapter<>(ListActivity.this,android.R.layout.simple_list_item_1,dataList);
//                listView = findViewById(R.id.listView);
//                listView.setAdapter(adapter);
            }
        });
    }
}




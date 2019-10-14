package com.example.lenovo.recyclerviewdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lenovo.recyclerviewdemo.gson.Newstech;
import com.example.lenovo.recyclerviewdemo.util.Utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsFragment extends Fragment {
    private static OkHttpClient client = new OkHttpClient();//使用静态，而不是使用final，因为最终变量不可更改
    private SwipeRefreshLayout swipeRefresh;
    private List<Newstech.DataBean> mDataList = new ArrayList<Newstech.DataBean>();
    private RecyclerView recyclerView;
    private TextAdapter2 adapter;
    private LinearLayoutManager layoutManager;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    adapter = new TextAdapter2(mDataList, getContext());
                    adapter.notifyDataSetChanged();
                    recyclerView.setAdapter(adapter);
                    swipeRefresh.setRefreshing(false);
            }
        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment, container, false);
        swipeRefresh = view.findViewById(R.id.swipe_refresh2);
        swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
        recyclerView = view.findViewById(R.id.recycler_view2);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new TextAdapter2(mDataList, getContext());
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle = getArguments();
        final String data = bundle.getString("name");

        requestNews(data);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                requestNews(data);
            }
        });
    }

    public void requestNews(String data) {
        Request request = new Request.Builder().url("http://api01.idataapi.cn:8000/news/toutiao?catid="+ data +"&apikey=eHaI9HAUWg3wEw9GrIzdEe2dBGy9dOsffxAopDLoEEpYAZFeQjye4f9mkGrSzjtY").build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                if (getActivity() == null)
                    return;
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getContext(), "获取新闻失败", Toast.LENGTH_SHORT).show();
                        swipeRefresh.setRefreshing(false);
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final Newstech newstech = Utility.handleNewstechResponse(responseText);
//                Log.d("1234",responseText);
//                Log.d("12345",newstech.toString());
                if(newstech != null && newstech.getRetcode().equals("000000")) {
                    int i = 0;
                    for(Newstech.DataBean dataBean: newstech.getData()) {
//                        Log.d("12346",dataBean.getTitle());
                        mDataList.add(i++,dataBean);
                        Log.d("23456",mDataList.toString());
                    }
                }
                Message msg = new Message();
                msg.what = 1;
                handler.sendMessage(msg);
            }
        });
    }
}

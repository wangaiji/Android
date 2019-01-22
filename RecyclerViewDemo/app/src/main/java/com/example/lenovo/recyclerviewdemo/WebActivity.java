package com.example.lenovo.recyclerviewdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.recyclerviewdemo.gson.Newstech;
import com.example.lenovo.recyclerviewdemo.gson.User;
import com.example.lenovo.recyclerviewdemo.util.Utility;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WebActivity extends AppCompatActivity {
    private WebView webView;
    private Button button;
  //  private ImageButton imageButton;
    private CircleImageView imageButton;
    private TextView user_name;
    private Bitmap bitmap;
    private String un = null;
    private static OkHttpClient client = new OkHttpClient();
    private LinearLayoutManager layoutManager;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                imageButton.setImageBitmap(bitmap);
                user_name.setText(un);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        user_name = findViewById(R.id.user_name);
        button = findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imageButton = findViewById(R.id.touxiang);
        String url3 = getIntent().getStringExtra("url3");
        requestUser(url3);
        webView = findViewById(R.id.web);
        if (getIntent().getStringExtra("url1") != null) {
            WebSettings webSettings = webView.getSettings();
            webSettings.setDomStorageEnabled(true);//主要是这句
            webSettings.setJavaScriptEnabled(true);//启用js
            webSettings.setBlockNetworkImage(false);//解决图片不显示
            webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
            webSettings.setLoadsImagesAutomatically(true);

            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });
            String url = getIntent().getStringExtra("url1");
            webView.loadUrl(url);
        } else {
            String url1 = getIntent().getStringExtra("url");
            String url2 = url1.replace("%3A", ":")
                    .replace("%2F", "/")
                    .replace("<div class=\"pgc-img\">", "")
                    .replace("</div>", "")
                    .replace("<a class=\"image\"  href=\"bytedance://large_image?url=", "<img class=\"content-image\" src=\"")
                    .replace("<a class=\"image\" type=\"gif\" href=\"bytedance://large_image?url=", "<img class=\"content-image\" src=\"")
                    .replaceAll("&index=[0-9]{1,2}", "")
                    .replaceAll("height=\"[0-9]{1,3}\"", "height=\"auto\"")
                    .replaceAll("width=\"[0-9]{1,3}\"", "width=\"98%\"")
                    .replace("></a><p class=\"pgc-img-caption\"></p></div>", "alt=\"\">")
                    + "<style>*,body,html,div,p,img{border:0;margin:3;padding:0;} </style>";
            webView.getSettings().setJavaScriptEnabled(true);//支持java脚本
            webView.getSettings().getBuiltInZoomControls();//支持缩放
            webView.loadDataWithBaseURL(null, url2, "text/html", "utf-8", null);
            Log.d("123456", url2);
        }
    }

    public void requestUser(String data) {
        Request request = new Request.Builder().url("http://api01.idataapi.cn:8000/profile/toutiao?id=" + data + "&apikey=eHaI9HAUWg3wEw9GrIzdEe2dBGy9dOsffxAopDLoEEpYAZFeQjye4f9mkGrSzjtY").build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final User user = Utility.handleUserResponse(responseText);
//                Log.d("1234",responseText);
//                Log.d("12345",newstech.toString());
                if(user != null && user.getRetcode().equals("000000")) {
//                    user.getData().get(0).getAvatarUrl();
                    bitmap = getHttpBitmap(user.getData().get(0).getAvatarUrl());
                    un = user.getData().get(0).getScreenName();
                    Message msg = new Message();
                    msg.what = 1;
                    handler.sendMessage(msg);
                }

            }
        });
    }

    public static Bitmap getHttpBitmap(String url){
        URL myFileURL;
        Bitmap bitmap=null;
        try{
            myFileURL = new URL(url);
            //获得连接
            HttpURLConnection conn=(HttpURLConnection)myFileURL.openConnection();
            //设置超时时间为6000毫秒，conn.setConnectionTiem(0);表示没有时间限制
            conn.setConnectTimeout(6000);
            //连接设置获得数据流
            conn.setDoInput(true);
            //不使用缓存
            conn.setUseCaches(false);
            //这句可有可无，没有影响
            //conn.connect();
            //得到数据流
            InputStream is = conn.getInputStream();
            //解析得到图片
            bitmap = BitmapFactory.decodeStream(is);
            //关闭数据流
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }


}
package com.example.lenovo.uibestpractice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public Button login;
    public Button register;
    private EditText accountText;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        accountText = findViewById(R.id.account_text);
        passwordText = findViewById(R.id.password_text);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.login:
                if(accountText.getText().toString().equals("admin")&&passwordText.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Client.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(MainActivity.this,"登录失败！",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.register:
                break;
            default:
                break;
        }
    }
}

package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contract.View {
    private Contract.Presenter presenter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.content_text);
        presenter = new DataPresenter(this, new Data(new RemoteDataSource(), new RemoteDataSource()));
        presenter.attachView(this);
  //      presenter.requestGrade();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.requestGrade();
    }

    @Override
    public void showGrade(int score) {
        textView.setText(score + "");
    }

    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }
}

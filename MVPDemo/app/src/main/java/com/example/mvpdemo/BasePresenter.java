package com.example.mvpdemo;

public interface BasePresenter<T> {
    void attachView(T view);
    void detachView();
}

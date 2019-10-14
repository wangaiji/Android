package com.example.mvpdemo;

public interface Contract {
    interface View extends BaseView {
        void showGrade(int score);
        void showError();
    }

    interface Presenter extends BasePresenter<View> {
        void requestGrade();
    }
}

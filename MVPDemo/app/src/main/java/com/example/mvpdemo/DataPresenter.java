package com.example.mvpdemo;

public class DataPresenter implements Contract.Presenter {
    private Contract.View view;
    private Data data;


    public DataPresenter(Contract.View view, Data data) {
        this.view = view;
        this.data = data;
//        this.attachView(view);
    }

    @Override
    public void requestGrade() {
        int d = data.getGrade();
        view.showGrade(d);
    }

    @Override
    public void attachView(Contract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {

    }
}

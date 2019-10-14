package com.example.mvpdemo;

public class Data implements DataSource {
    // 网络数据
    private final RemoteDataSource remoteDataSource;
    private final DataSource localDataSource;

    public Data(RemoteDataSource remoteDataSource, DataSource localDataSource) {
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
    }

    @Override
    public int getGrade() {
        return remoteDataSource.getGrade();
    }
}

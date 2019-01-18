package com.example.lenovo.recyclerviewdemo.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.recyclerviewdemo.R;

public class ThreeViewHolder extends RecyclerView.ViewHolder {
    public View threeView;
    public TextView title3;
    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public TextView source3;

    public ThreeViewHolder(View view) {
        super(view);
        this.threeView = view;
        this.title3 = view.findViewById(R.id.title3);
        this.image1 = view.findViewById(R.id.image1);
        this.image2 = view.findViewById(R.id.image2);
        this.image3 = view.findViewById(R.id.image3);
        this.source3 = view.findViewById(R.id.source3);
    }
}

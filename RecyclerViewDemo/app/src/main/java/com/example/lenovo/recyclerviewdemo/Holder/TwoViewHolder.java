package com.example.lenovo.recyclerviewdemo.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.recyclerviewdemo.R;

public class TwoViewHolder extends RecyclerView.ViewHolder{
    public View twoView;
    public TextView title2;
    public ImageView image;
    public TextView source2;

    public TwoViewHolder(View view) {
        super(view);
        this.twoView = view;
        this.title2 = view.findViewById(R.id.title2);
        this.image = view.findViewById(R.id.image);
        this.source2 = view.findViewById(R.id.source2);
    }

}

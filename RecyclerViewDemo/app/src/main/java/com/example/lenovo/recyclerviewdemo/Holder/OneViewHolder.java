package com.example.lenovo.recyclerviewdemo.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lenovo.recyclerviewdemo.R;

public class OneViewHolder extends RecyclerView.ViewHolder{
    public View oneView;
    public TextView title1;
    public TextView source1;

    public OneViewHolder(@NonNull View itemView) {
        super(itemView);
        this.oneView = itemView;
        this.title1 = itemView.findViewById(R.id.text_item_title1);
        this.source1 = itemView.findViewById(R.id.source1);
    }
}

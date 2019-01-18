package com.example.lenovo.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lenovo.recyclerviewdemo.Holder.OneViewHolder;
import com.example.lenovo.recyclerviewdemo.Holder.ThreeViewHolder;
import com.example.lenovo.recyclerviewdemo.Holder.TwoViewHolder;
import com.example.lenovo.recyclerviewdemo.gson.Newshot;
import com.example.lenovo.recyclerviewdemo.gson.Newstech;

import java.util.List;

public class TextAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;
    public static final int THREE_ITEM = 3;

    private Context mContext;

    private List<Newstech.DataBean> mDataList;

    public TextAdapter2(List<Newstech.DataBean> dataList, Context context) {
        this.mDataList = dataList;
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        RecyclerView.ViewHolder holder = null;
        if (ONE_ITEM == ViewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item, parent, false);
            holder = new OneViewHolder(view);
            final OneViewHolder holder1 = (OneViewHolder) holder;
            holder1.oneView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder1.getAdapterPosition();
                    Newstech.DataBean dataBean = mDataList.get(position);
                    Intent intent = new Intent(mContext, WebActivity.class);
                    intent.putExtra("url", dataBean.getHtml());
                    intent.putExtra("url3", dataBean.getPosterId());
                    mContext.startActivity(intent);
                }
            });
        } else if (TWO_ITEM == ViewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_image, parent, false);
            holder = new TwoViewHolder(view);
            final TwoViewHolder holder2 = (TwoViewHolder) holder;
            holder2.twoView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder2.getAdapterPosition();
                    Newstech.DataBean dataBean = mDataList.get(position);
                    Intent intent = new Intent(mContext, WebActivity.class);
                    intent.putExtra("url", dataBean.getHtml());
                    intent.putExtra("url3", dataBean.getPosterId());
                    mContext.startActivity(intent);
                }
            });
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.three_image, parent, false);
            holder = new ThreeViewHolder(view);
            final ThreeViewHolder holder3 = (ThreeViewHolder) holder;
            holder3.threeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = holder3.getAdapterPosition();
                    Newstech.DataBean dataBean = mDataList.get(position);
                    Intent intent = new Intent(mContext, WebActivity.class);
                    intent.putExtra("url", dataBean.getHtml());
                    intent.putExtra("url3", dataBean.getPosterId());
                    mContext.startActivity(intent);
                }
            });
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof OneViewHolder) {
            OneViewHolder holder1 = (OneViewHolder) holder;
            holder1.title1.setText(mDataList.get(position).getTitle());
            holder1.source1.setText(mDataList.get(position).getPosterScreenName() + "  评论" + mDataList.get(position).getCommentCount() + "  " + mDataList.get(position).getPublishDateStr());
        } else if (holder instanceof TwoViewHolder) {
            TwoViewHolder holder2 = ((TwoViewHolder) holder);
            holder2.title2.setText(mDataList.get(position).getTitle());
            Glide.with(mContext)
                    .load(mDataList.get(position).getImageUrls().get(0))
                    .into(holder2.image);
            holder2.source2.setText(mDataList.get(position).getPosterScreenName() + "  评论" + mDataList.get(position).getCommentCount() + "  " + mDataList.get(position).getPublishDateStr());
        } else {
            ThreeViewHolder holder3 = ((ThreeViewHolder) holder);
            holder3.title3.setText(mDataList.get(position).getTitle());
            Glide.with(mContext)
                    .load(mDataList.get(position).getImageUrls().get(0))
                    .into(holder3.image1);
            Glide.with(mContext)
                    .load(mDataList.get(position).getImageUrls().get(1))
                    .into(holder3.image2);
            Glide.with(mContext)
                    .load(mDataList.get(position).getImageUrls().get(2))
                    .into(holder3.image3);
            holder3.source3.setText(mDataList.get(position).getPosterScreenName() + "  评论" + mDataList.get(position).getCommentCount() + "  " + mDataList.get(position).getPublishDateStr());
        }
    }

    @Override
    public int getItemCount() {
        if (mDataList != null) {
            return mDataList.size();
        } else {
            return 0;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mDataList.get(position).getImageUrls() == null) {
            return ONE_ITEM;
        } else if (mDataList.get(position).getImageUrls().size() == 1 || mDataList.get(position).getImageUrls().size() == 2) {
            return TWO_ITEM;
        } else if (mDataList.get(position).getImageUrls().size() > 3) {
            return THREE_ITEM;
        } else {
            return 0;
        }
    }
}

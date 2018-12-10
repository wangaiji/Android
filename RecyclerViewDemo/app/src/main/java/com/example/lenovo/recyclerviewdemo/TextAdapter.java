package com.example.lenovo.recyclerviewdemo;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.example.lenovo.recyclerviewdemo.Holder.OneViewHolder;
import com.example.lenovo.recyclerviewdemo.Holder.ThreeViewHolder;
import com.example.lenovo.recyclerviewdemo.Holder.TwoViewHolder;
import com.example.lenovo.recyclerviewdemo.gson.Newshot;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;
    public static final int THREE_ITEM = 3;

    private Context mContext;

    private List<Newshot.DataBean> mDataList;

    public TextAdapter(List<Newshot.DataBean> dataList, Context context) {
        this.mDataList = dataList;
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        RecyclerView.ViewHolder holder = null;
        if(ONE_ITEM == ViewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item, parent, false);
            holder = new OneViewHolder(view);
        }else if(TWO_ITEM == ViewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_image, parent, false);
            holder = new TwoViewHolder(view);
        }else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.three_image, parent, false);
            holder = new ThreeViewHolder(view);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof OneViewHolder) {
            OneViewHolder holder1 = (OneViewHolder) holder;
            holder1.title1.setText(mDataList.get(position).getTitle());
            holder1.source1.setText(mDataList.get(position).getSource() + "  评论" + mDataList.get(position).getComment_count() + "  刚刚");
        }else if(holder instanceof TwoViewHolder){
            TwoViewHolder holder2 = ((TwoViewHolder) holder);
            holder2.title2.setText(mDataList.get(position).getTitle());
            Glide.with(mContext)
                    .load(mDataList.get(position).getLarge_image_list().get(0).getUrl())
                    .into(holder2.image);
            holder2.source2.setText(mDataList.get(position).getSource() + "  评论" + mDataList.get(position).getComment_count() + "  刚刚");
        }else {
            ThreeViewHolder holder3 = ((ThreeViewHolder) holder);
            holder3.title3.setText(mDataList.get(position).getTitle());
            Glide.with(mContext)
                    .load(mDataList.get(position).getImage_list().get(0).getUrl())
                    .into(holder3.image1);
            Glide.with(mContext)
                    .load(mDataList.get(position).getImage_list().get(1).getUrl())
                    .into(holder3.image2);
            Glide.with(mContext)
                    .load(mDataList.get(position).getImage_list().get(2).getUrl())
                    .into(holder3.image3);
            holder3.source3.setText(mDataList.get(position).getSource() + "  评论" + mDataList.get(position).getComment_count() + "  刚刚");
        }
    }

    @Override
    public int getItemCount() {
        if(mDataList != null) {
            return mDataList.size();
        }else {
            return 0;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(!mDataList.get(position).isHas_video() && mDataList.get(position).isHas_image() && mDataList.get(position).getImage_list() != null) {
            return THREE_ITEM;
        }else if(mDataList.get(position).isHas_video() && mDataList.get(position).getLarge_image_list() != null){
            return TWO_ITEM;
        }else {
            return ONE_ITEM;
        }
    }
}

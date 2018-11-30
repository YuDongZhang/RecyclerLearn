package com.example.pateo.recyclerlearn;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * 带有头部、尾部的RecyclerView的Adapter
 */


public class RvAdapterHeadFoot extends RecyclerView.Adapter<RvAdapterHeadFoot.HFViewHolder> {

    public static final String TAG = RvAdapterHeadFoot.class.getSimpleName();

    private final int TYPE_HEAD = 0; //头
    private final int TYPE_ITEM = 1; //正常
    private final int TYPE_FOOT = -1; //尾部

    private Context mContext;
    private ArrayList<String> strings = new ArrayList<>();

    public RvAdapterHeadFoot(Context context){
        this.mContext = context;
    }

    public void setModels(ArrayList<String> strings){
        if (strings != null && !strings.isEmpty()){
            this.strings = strings;
            notifyDataSetChanged();
        }
    }

    @Override
    public HFViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //创建view 持有者
        View view;
        if (viewType == TYPE_HEAD){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_head_rv,parent,false);
        }else if (viewType == TYPE_FOOT){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foot_rv,parent,false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_head_foot_rv,parent,false);
        }
        return new HFViewHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(HFViewHolder holder, int position) { //根据绑定持有者 ,给控件中的每个元素赋值
        int viewType = getItemViewType(position);
        if (viewType == TYPE_HEAD){
            //显示、控件操作可在这里处理，我这边直接return；
            return;
        }else if (viewType == TYPE_FOOT){
            //显示、控件操作可在这里处理，我这边直接return；
            return;
        }else {
            //这里positionModel是在数据集合ArrayList<String>中的真实position；
            int positionModel = position - 1;
            String url = strings.get(positionModel);

            Glide
                .with(mContext)
                .load(url)
                .thumbnail(0.1f)
                .apply(new RequestOptions().placeholder(R.mipmap.ic_launcher))
                .into(holder.iv);
            holder.tv.setText(url);
        }

    }

    @Override
    public int getItemCount() {
        //因为添加了 head 和foot 所以总的数量需要 加2
        return strings.size() + 2;
    }

    @Override
    public int getItemViewType(int position) {
        //根据position返回不同viewType，在onCreateViewHolder中初始化不同的布局
        if (position == 0){
            return TYPE_HEAD;
        }else if (position == strings.size() + 1){
            return TYPE_FOOT;
        }
        return TYPE_ITEM;
    }

    class HFViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;

         HFViewHolder(View itemView, int viewType) {
            super(itemView);

            if (viewType == TYPE_FOOT || viewType == TYPE_HEAD){
                //如果head/foot当中有控件的显示操作，可以在这里声明控件，我这里直接return；
                return;
            }

            iv = itemView.findViewById(R.id.iv_item_head_foot);
            tv = itemView.findViewById(R.id.tv_item_head_foot);
        }

    }
}

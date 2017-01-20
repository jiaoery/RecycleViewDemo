package com.jixiang52002.recycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jixiang52002.recycleviewdemo.CellData;
import com.jixiang52002.recycleviewdemo.MainActivity;
import com.jixiang52002.recycleviewdemo.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jixiang52002 on 2016/8/17.
 */
public class MyAdapter extends RecyclerView.Adapter{


    private MainActivity.OnRecyclerViewItemClickListener mOnItemClickListener = null;
    public void setOnItemClickListener(MainActivity.OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    private List<CellData> datas;
    private Context mContext;

    public MyAdapter(Context mContext) {
        this.mContext=mContext;
        datas=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            datas.add(new CellData("游戏王"+i,"城之内克也"+i));

        }

    }

    //在指定位置处添加信息
    public void addItem(int positionToAdd) {
        datas.add(positionToAdd,new CellData("青眼白龙","海马赖人"));
        notifyDataSetChanged();

    }

    public void removeData(int positionToRemove) {
        datas.remove(positionToRemove);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;

        private TextView tvTitle,tvContent;

        public ViewHolder(View root) {
            super(root);
            this.root=root;
            tvTitle= (TextView) root.findViewById(R.id.tv_titile);
            tvContent= (TextView) root.findViewById(R.id.tv_content);
//            th = itemView;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }

//        public TextView getTv() {
//            return tv;
//        }
    }

    //创建一个ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        return new ViewHolder(new TextView(parent.getContext()));
        View view=LayoutInflater.from(mContext).inflate(R.layout.list_cell,parent,false);
        //获取列表项控件
        return new ViewHolder(view);
    }

    //加载数据，类似于BaseAdapter的getview
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        TextView tv = (TextView) holder.itemView;
//        tv.setText(data[position]);
        final ViewHolder vh= (ViewHolder) holder;

        CellData cd=datas.get(position);

        vh.getTvTitle().setText(cd.titile);
        vh.getTvContent().setText(cd.content);

        vh.root.setTag(cd);

        if(mOnItemClickListener!=null){
            vh.root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos=vh.getLayoutPosition();
                    mOnItemClickListener.onItemClick(v, (CellData) v.getTag(),pos);
                }
            });
        }
    }


    //数量
    @Override
    public int getItemCount() {
        return datas.size();
    }

//    private String[] data = new String[]{"hello", "yuayuan", "ime"};

}

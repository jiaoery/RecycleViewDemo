package com.jixiang52002.recycleviewdemo.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jixiang52002.recycleviewdemo.R;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by cqjix on 2017/1/18.
 */

public class FunctionViewHolder extends BaseViewHolder<String>{

    private Context mContext;
    private TextView textView;//文字展示


    public FunctionViewHolder(Context mContext, ViewGroup viewGroup){
        super(viewGroup, R.layout.item_text);
        this.mContext=mContext;
        textView= (TextView) itemView.findViewById(R.id.text);
    }

    @Override
    public void setData(String data) {
        textView.setText(data);
    }
}

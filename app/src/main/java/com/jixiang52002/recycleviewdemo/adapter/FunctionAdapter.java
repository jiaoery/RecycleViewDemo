package com.jixiang52002.recycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.jixiang52002.recycleviewdemo.viewholder.FunctionViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cqjix on 2017/1/18.
 */

public class FunctionAdapter extends RecyclerArrayAdapter<String> {

    private Context mContext;


    List<String> funtions=new ArrayList<>();

    public FunctionAdapter(Context context) {
        super(context);
        this.mContext=context;
    }


    /**
     * 返回viewholder
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new FunctionViewHolder(mContext,parent);
    }

}

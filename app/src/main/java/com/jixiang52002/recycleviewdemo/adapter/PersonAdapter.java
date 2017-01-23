package com.jixiang52002.recycleviewdemo.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jixiang52002.recycleviewdemo.entites.Person;
import com.jixiang52002.recycleviewdemo.viewholder.PersonViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by Mr.Jude on 2015/7/18.
 */
public class PersonAdapter extends RecyclerArrayAdapter<Person> {
    private Context mContext;
    public PersonAdapter(Context context) {
        super(context);
        this.mContext=context;
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {

        return new PersonViewHolder(parent);
    }
}

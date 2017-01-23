package com.jixiang52002.recycleviewdemo.viewholder;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jixiang52002.recycleviewdemo.R;
import com.jixiang52002.recycleviewdemo.entites.Person;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by cqjix on 2017/1/23.
 */

public class PersonViewHolder extends BaseViewHolder<Person> {

    private TextView mTv_name;
    private ImageView mImg_face;
    private TextView mTv_sign;

    public PersonViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_person);
        mTv_name = $(R.id.person_name);
        mTv_sign = $(R.id.person_sign);
        mImg_face = $(R.id.person_face);
    }

    @Override
    public void setData(Person data) {
        super.setData(data);
        Log.i("ViewHolder","position"+getDataPosition());
        mTv_name.setText(data.getName());
//        mTv_sign.setText(data.getSign());
        Glide.with(getContext())
                .load(data.getFace())
                .placeholder(R.drawable.default_image)
                .bitmapTransform(new CropCircleTransformation(getContext()))
                .into(mImg_face);
    }

}

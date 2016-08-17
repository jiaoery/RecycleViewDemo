package com.jixiang52002.recycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv=new RecyclerView(this);
        setContentView(rv);
        //设置recycleview的布局对象,死党额惨呼为是否反转
//        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        rv.setLayoutManager(new GridLayoutManager(this,2));


        //为recycleview设置适配器
        rv.setAdapter(new MyAdapter());

    }

}

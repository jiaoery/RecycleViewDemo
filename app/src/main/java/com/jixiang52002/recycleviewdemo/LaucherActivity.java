package com.jixiang52002.recycleviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jixiang52002.recycleviewdemo.adapter.FunctionAdapter;
import com.jixiang52002.recycleviewdemo.decoration.DividerItemDecoration;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 启动页
 */

public class LaucherActivity extends Activity implements RecyclerArrayAdapter.OnItemClickListener{

    EasyRecyclerView easyRecyclerView;

    private List<String> functions;//功能界面

    private FunctionAdapter functionAdapter;

    protected LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucher);
        easyRecyclerView= (EasyRecyclerView) findViewById(R.id.erv_laucher);
        initData();
        initView();

    }

    /**
     * 初始化界面
     */
    private void initView() {
        functionAdapter=new FunctionAdapter(this);
        layoutManager=new LinearLayoutManager(this);
        easyRecyclerView.setLayoutManager(layoutManager);
        easyRecyclerView.setAdapter(functionAdapter);
        DividerItemDecoration divider=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST);
        easyRecyclerView.addItemDecoration(divider);
        functionAdapter.setOnItemClickListener(this);
        easyRecyclerView.setAdapter(functionAdapter);
        functionAdapter.addAll(functions);

    }

    private void initData() {
        functions=new ArrayList<>();
        functions.add("native recyclerview");
        functions.add("easyrecyclerview");
    }

    @Override
    public void onItemClick(int position) {
        switch (position){
            case 0:
                startActivity(new Intent(this,MainActivity.class));
                break;
            case 1:
                break;
        }
    }
}

package com.jixiang52002.recycleviewdemo;

import android.app.Activity;
import android.os.Bundle;

import com.jude.easyrecyclerview.EasyRecyclerView;

/**
 * 启动页
 */

public class LaucherActivity extends Activity {

    EasyRecyclerView easyRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucher);
        easyRecyclerView= (EasyRecyclerView) findViewById(R.id.erv_laucher);

    }
}

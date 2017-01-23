package com.jixiang52002.recycleviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.jixiang52002.recycleviewdemo.R;

public class MultiStyleActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_style);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        initToolbar(toolbar,getString(R.string.multi_style));
    }
}

package com.jixiang52002.recycleviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.jixiang52002.recycleviewdemo.R;

public class EasyRecyclerViewActivity extends BaseActivity {
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_recycler_view);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        initToolbar(toolbar,getString(R.string.toolbar_function));
    }


}

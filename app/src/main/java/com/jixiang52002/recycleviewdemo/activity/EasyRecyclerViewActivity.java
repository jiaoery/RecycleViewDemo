package com.jixiang52002.recycleviewdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jixiang52002.recycleviewdemo.MainActivity;
import com.jixiang52002.recycleviewdemo.R;
import com.jude.easyrecyclerview.EasyRecyclerView;

public class EasyRecyclerViewActivity extends BaseActivity {
    private Toolbar toolbar;

    Button refreshAndMore;
    Button multiStyle;
    Button headerAndFooter;
    Button collapsing;
    Button staggeredGrid;
    Button horizontal;
    Button stickyHeader;
    Button insert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_recycler_view);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        initToolbar(toolbar,getString(R.string.easyrecyclerview_funtion));
        //开启debug模式
        EasyRecyclerView.DEBUG = true;
        refreshAndMore = (Button) findViewById(R.id.refresh_and_more);
        refreshAndMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, RefreshAndMoreActivity.class));
            }
        });
        multiStyle = (Button) findViewById(R.id.multi_style);
        multiStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, MultiStyleActivity.class));
            }
        });
        headerAndFooter = (Button) findViewById(R.id.header_footer);
        headerAndFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, HeaderFooterActivity.class));
            }
        });
        collapsing = (Button) findViewById(R.id.collapsing);
        collapsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, CollapsingActivity.class));
            }
        });
        staggeredGrid = (Button) findViewById(R.id.staggered_grid);
        staggeredGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, StaggeredGridActivity.class));
            }
        });
        horizontal = (Button) findViewById(R.id.horizontal);
        horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, HorizontalActivity.class));
            }
        });  stickyHeader = (Button) findViewById(R.id.stiky_header);
        stickyHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, StickyHeaderActivity.class));
            }
        });
        insert = (Button) findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecyclerViewActivity.this, InsertActivity.class));
            }
        });
    }


}

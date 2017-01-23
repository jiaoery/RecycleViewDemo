package com.jixiang52002.recycleviewdemo.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Display;

import com.jixiang52002.recycleviewdemo.DataProvider;
import com.jixiang52002.recycleviewdemo.R;
import com.jixiang52002.recycleviewdemo.adapter.PersonAdapter;
import com.jixiang52002.recycleviewdemo.entites.Person;
import com.jixiang52002.recycleviewdemo.util.DisplayUtils;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.DividerDecoration;

import java.util.List;

public class InsertActivity extends BaseActivity {

    private Toolbar toolbar;
    private EasyRecyclerView recyclerView;
    private RecyclerArrayAdapter<Person> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initView();
    }

    private void initView() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        initToolbar(toolbar,getString(R.string.insert));
        recyclerView = (EasyRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerDecoration itemDecoration = new DividerDecoration(Color.GRAY, DisplayUtils.dip2px(this,0.5f), DisplayUtils.dip2px(this,72),0);
        itemDecoration.setDrawLastItem(false);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapterWithProgress(adapter = new PersonAdapter(this));
        List<Person> persons = DataProvider.getPersonList(0);
        adapter.addAll(persons.subList(0,3));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}

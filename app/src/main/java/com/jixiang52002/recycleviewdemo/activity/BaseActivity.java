package com.jixiang52002.recycleviewdemo.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.TextView;

import com.jixiang52002.recycleviewdemo.R;

/**
 * Created by cqjix on 2017/1/20.
 */

public class BaseActivity extends AppCompatActivity {
    /**
     * 点击左上角图标，以便关闭当前activity
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(0, R.anim.silde_right_out);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * toolbar的初始化
     *
     * @param mToolBar
     * @param activityName
     */
    public void initToolbar(Toolbar mToolBar, String activityName) {
        mToolBar.setTitle("");
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        if (toolbar_title != null && !TextUtils.isEmpty(activityName)) {
            toolbar_title.setText(activityName);
        }
        initToolbar(mToolBar);
    }

    public void initToolbar(Toolbar mToolBar, int activityName) {
        mToolBar.setTitle("");
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        if (toolbar_title != null) {
            toolbar_title.setText(activityName);
        }
//        mToolBar.setTitle(activityName);
        initToolbar(mToolBar);
    }

    private void initToolbar(Toolbar mToolBar) {
        mToolBar.setTitleTextColor(getResources().getColor(R.color.white));
//        mToolBar.setNavigationIcon(R.drawable.icon_left);
        setSupportActionBar(mToolBar);
        ActionBar actionBar = getSupportActionBar();
        //无效化actionbar
        actionBar.setDisplayShowHomeEnabled(true);
        //左边返回键功能
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);
    }

    protected void setToolbarName(String name) {
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText(name);
    }
}

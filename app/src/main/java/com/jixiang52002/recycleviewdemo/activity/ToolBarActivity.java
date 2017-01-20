package com.jixiang52002.recycleviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.jixiang52002.recycleviewdemo.R;

public class ToolBarActivity extends BaseActivity {

    private Toolbar toolbar;
    private MenuItem chatMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        initToolbar(toolbar,getString(R.string.toolbar_function));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        chatMenu= menu.findItem(R.id.action_chat);
        chatMenu.setVisible(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,"聊天开启",Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}

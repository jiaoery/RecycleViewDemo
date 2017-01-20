package com.jixiang52002.recycleviewdemo;

import android.graphics.Outline;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.jixiang52002.recycleviewdemo.adapter.MyAdapter;
import com.jixiang52002.recycleviewdemo.decoration.DividerItemDecoration;

public class MainActivity extends AppCompatActivity {

    private FrameLayout deleteBar;
    private RecyclerView rv;
    private View fabAdd;
    private LinearLayoutManager layoutManager;
    private float dy1;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deleteBar = (FrameLayout) findViewById(R.id.deleteBar);
        rv = (RecyclerView) findViewById(R.id.rv_main);

        //设置recycleview的布局对象,第三个参数为是否反转
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        //设置Item增加、移除动画
        rv.setItemAnimator(new DefaultItemAnimator());
        //添加分割线
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        final MyAdapter adapter = new MyAdapter(this);
//
//        //为recycleview设置适配器
        rv.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, CellData data, int position) {
                Toast.makeText(MainActivity.this, "data:title=" + data.titile + "content=" + data.content + position, Toast.LENGTH_SHORT).show();
            }
        });
        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {

            @Override
            public void getOutline(View view, Outline outline) {
                // 获取按钮的尺寸
                int fabSize = getResources().getDimensionPixelSize(
                        R.dimen.fab_size);
                // 设置轮廓的尺寸
                outline.setOval(-4, -4, fabSize + 2, fabSize + 2);

            }
        };
        // 获得右下角圆形按钮对象
        fabAdd = findViewById(R.id.fab_add);
//
        fabAdd.setOutlineProvider(viewOutlineProvider);


        //  处理添加按钮的单击事件
        fabAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //  获取第一个可视的Item的位置
                int positionToAdd = layoutManager.findFirstCompletelyVisibleItemPosition();
                //  在该位置插入新的Item
                adapter.addItem(positionToAdd);

            }
        });
//          处理删除事件
        deleteBar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int positionToRemove = layoutManager.findFirstCompletelyVisibleItemPosition();

                // 删除第一个可视的ite
                adapter.removeData(positionToRemove);

            }
        });

        rv.addOnScrollListener(new RecyclerView.OnScrollListener()
        {

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {

                super.onScrolled(recyclerView, dx, dy);
                //  dx：大于0，向右滚动    小于0，向左滚动
                //  dy：大于0，向上滚动    小于0，向下滚动

                if(dy > 0)
                {
                    //  列表向上滚动，隐藏删除面板
                    if(deleteBar.getVisibility() == View.VISIBLE)
                    {
                        hideDeleteBar();
                    }
                }
                else
                {
                    // 列表向下滚动，显示删除面板
                    if(deleteBar.getVisibility() == View.GONE)
                    {
                        showDeleteBar();
                    }
                }

            }
        });
    }

    //显示顶部删除栏目
    private void showDeleteBar() {

        deleteBar.startAnimation(AnimationUtils.loadAnimation(this,
                R.anim.translate_up_on));

        deleteBar.setVisibility(View.VISIBLE);
    }

    //隐藏顶部删除栏目
    private void hideDeleteBar() {

        deleteBar.startAnimation(AnimationUtils.loadAnimation(this,
                R.anim.translate_up_off));

        deleteBar.setVisibility(View.GONE);
    }

    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, CellData data, int position);
    }

}

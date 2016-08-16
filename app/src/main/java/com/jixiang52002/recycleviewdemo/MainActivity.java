package com.jixiang52002.recycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv=new RecyclerView(this);
        setContentView(rv);
        //设置recycleview的布局对象
        rv.setLayoutManager(new LinearLayoutManager(this));


        //为recycleview设置适配器
        rv.setAdapter(new RecyclerView.Adapter() {
            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView tv;
              public ViewHolder(TextView itemView){
                  super(itemView);
                  tv=itemView;
              }

                public TextView getTv(){
                    return tv;
                }
            }
            //创建一个ViewHolder
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                return new ViewHolder(new TextView(parent.getContext()));
            }

            //加载数据，类似于BaseAdapter的getview
            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                 TextView tv= (TextView) holder.itemView;
                tv.setText(data[position]);
            }
          //数量
            @Override
            public int getItemCount() {
                return data.length;
            }

            private String[] data=new String[]{"hello","yuayuan","ime"};
        });

    }
}

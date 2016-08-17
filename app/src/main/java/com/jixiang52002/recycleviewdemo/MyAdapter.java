package com.jixiang52002.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jixiang52002 on 2016/8/17.
 */
class MyAdapter extends RecyclerView.Adapter {
    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;

        private TextView tvTitle,tvContent;

        public ViewHolder(View root) {
            super(root);
            tvTitle= (TextView) root.findViewById(R.id.tv_titile);
            tvContent= (TextView) root.findViewById(R.id.tv_content);
//            th = itemView;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }

//        public TextView getTv() {
//            return tv;
//        }
    }

    //创建一个ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        return new ViewHolder(new TextView(parent.getContext()));
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    //加载数据，类似于BaseAdapter的getview
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        TextView tv = (TextView) holder.itemView;
//        tv.setText(data[position]);
        ViewHolder vh= (ViewHolder) holder;

        CellData cd=data[position];

        vh.getTvTitle().setText(cd.titile);
        vh.getTvContent().setText(cd.content);
    }

    //数量
    @Override
    public int getItemCount() {
        return data.length;
    }

//    private String[] data = new String[]{"hello", "yuayuan", "ime"};

    private CellData[] data=new CellData[]{new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")
    ,new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也"),new CellData("游戏王","武藤游戏"),new CellData("庸才的骨气","城之内克也")};
}

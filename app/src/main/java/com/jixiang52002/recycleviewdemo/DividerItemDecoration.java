package com.jixiang52002.recycleviewdemo;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by jixiang52002 on 2016/8/17.
 * 分割线
 */

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    //分割线资源 可以自定义
    private static final int[] ATTRS = new int[]{
           android.R.attr.divider
    };

    public static final int HORIZONTAL_LIST = LinearLayoutManager.HORIZONTAL;

    public static final int VERTICAL_LIST = LinearLayoutManager.VERTICAL;

    //分割条对象
    private Drawable mDivider;

    private int mOrientation;

    public DividerItemDecoration(Context context, int orientation) {
        final TypedArray a = context.obtainStyledAttributes(ATTRS);
        //获取系统提供的分割条和drawable对象
        mDivider = a.getDrawable(0);
        //回收TypeArray所占用的资源
        a.recycle();
        setOrientation(orientation);
    }

    public void setOrientation(int orientation) {
        if (orientation != HORIZONTAL_LIST && orientation != VERTICAL_LIST) {
            throw new IllegalArgumentException("invalid orientation");
        }
        mOrientation = orientation;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent) {
        if (mOrientation == VERTICAL_LIST) {
            drawVertical(c, parent);
        } else {
            drawHorizontal(c, parent);
        }
    }

    public void drawVertical(Canvas c, RecyclerView parent) {
        //获取列表项距离左边缘的距离
        final int left = parent.getPaddingLeft();
        //获取列表项距离右边缘的距离
        final int right = parent.getWidth() - parent.getPaddingRight();
        //获取列表项的总数
        final int childCount = parent.getChildCount();
        //开始绘制所有列表项之间的分割线
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            //获取当前列表项布局参数信息
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            //获取分割条左上角的纵坐标
            final int top = child.getBottom() + params.bottomMargin;
            //获取分割条右下角的纵坐标
            final int bottom = top + mDivider.getIntrinsicHeight();
            //分割条矩形的形状的绘制范围
            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

    public void drawHorizontal(Canvas c, RecyclerView parent) {
        final int top = parent.getPaddingTop();
        final int bottom = parent.getHeight() - parent.getPaddingBottom();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            final int left = child.getRight() + params.rightMargin;
            final int right = left + mDivider.getIntrinsicHeight();
            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
        if (mOrientation == VERTICAL_LIST) {
            outRect.set(0, 0, 0, mDivider.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
        }
    }
}
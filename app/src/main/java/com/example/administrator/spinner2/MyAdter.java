package com.example.administrator.spinner2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/3/16.
 */

public class MyAdter extends BaseAdapter{
    private final MainActivity mainActivity;
    private final int[] imageIds;

    public MyAdter(MainActivity mainActivity, int[] imageIds) {

        this.mainActivity = mainActivity;
        this.imageIds = imageIds;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    //该方法返回的View代表了每个列表项
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //创建一个ImageView
        ImageView imageView=new ImageView(mainActivity);
        imageView.setImageResource(imageIds[position]);
        //设置ImageView的缩放类型
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        //为ImageView设置布局参数
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        return imageView;
    }
}

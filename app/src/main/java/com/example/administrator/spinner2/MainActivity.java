package com.example.administrator.spinner2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {
    private int[] imageIds=new int[]{R.drawable.one,R.drawable.twe,R.drawable.three,R.drawable.frou,R.drawable.five};
    private AdapterViewFlipper avf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avf = (AdapterViewFlipper) findViewById(R.id.avf);
        MyAdter myAdter = new MyAdter(MainActivity.this, imageIds);
        avf.setAdapter(myAdter);
    }
    public void prev(View source)
    {
        //显示上一个组件
        avf.showPrevious();
        //停止自动播放
        avf.stopFlipping();
    }

    public void next(View source)
    {
        //显示一个组件
        avf.showNext();
        //停止自动播放
        avf.stopFlipping();
    }

    public void auto(View source)
    {
        if(!avf.isAutoStart())
        {
            //开始自动播放
            avf.startFlipping();
        }
        else
        {
            //停止自动播放
            avf.stopFlipping();
        }


    }
}

package com.leyifu.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leyifu.viewpagerdemo.bean.NewsInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private List<View> list;
    private List<NewsInfo> newsInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = ((ViewPager) findViewById(R.id.vp));
        //方法一  使用view加载
//        initView();
//        vp.setAdapter(new MyViewPagerAdapter(list));
        initData();
        vp.setAdapter(new MyViewPagerAdapter(this, newsInfos));
        vp.setCurrentItem(100000 * newsInfos.size());

    }

    private void initData() {
        newsInfos = new ArrayList<NewsInfo>();
        newsInfos.add(new NewsInfo(R.mipmap.a, "我是图片1", R.mipmap.p_not_focus));
        newsInfos.add(new NewsInfo(R.mipmap.b, "我是图片2", R.mipmap.p_not_focus));
        newsInfos.add(new NewsInfo(R.mipmap.c, "我是图片3", R.mipmap.p_not_focus));
        newsInfos.add(new NewsInfo(R.mipmap.d, "我是图片4", R.mipmap.p_not_focus));
        newsInfos.add(new NewsInfo(R.mipmap.e, "我是图片5", R.mipmap.p_not_focus));
    }

    private void initView() {
        list = new ArrayList<View>();
        View view1 = View.inflate(this, R.layout.viewpager1, null);
        View view2 = View.inflate(this, R.layout.viewpager2, null);
        View view3 = View.inflate(this, R.layout.viewpager3, null);
        View view4 = View.inflate(this, R.layout.viewpager4, null);
        View view5 = View.inflate(this, R.layout.viewpager5, null);
        list.add(view1);
        list.add(view2);
        list.add(view3);
        list.add(view4);
        list.add(view5);
    }
}

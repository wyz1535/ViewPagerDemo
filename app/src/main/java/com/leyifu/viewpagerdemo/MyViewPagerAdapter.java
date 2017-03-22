package com.leyifu.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.leyifu.viewpagerdemo.bean.NewsInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
class MyViewPagerAdapter extends PagerAdapter {

    private final List<NewsInfo> list;
    private final Context context;
    private ImageView iv_view_item;
    private TextView tx_view_item;

    public MyViewPagerAdapter(Context context, List<NewsInfo> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
//        return list == null ? 0 : list.size();
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    //初始化数据
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        View view = list.get(position);
        View view = View.inflate(context, R.layout.viewpager_item, null);
//        NewsInfo newsInfo = list.get(position);
        iv_view_item = ((ImageView) view.findViewById(R.id.iv_view_item));
        tx_view_item = ((TextView) view.findViewById(R.id.tx_view_item));
        iv_view_item.setImageResource(list.get(position % 4).getImg());
        tx_view_item.setText(list.get(position % 4).getTitle());
        container.addView(view);
        return view;
    }

    //移除条目
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //此处父类抛出一个异常 必须把super注解掉
//        super.destroyItem(container, position, object);
        container.removeView((View) object);

    }


}

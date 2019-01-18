package com.example.lenovo.recyclerviewdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TestViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<String> data;
    private List<Fragment> fragments;
    TestViewPagerAdapter(FragmentManager fragmentManager, List<String> data, List<Fragment> fragments) {
        super(fragmentManager);
        this.data = data;
        this.fragments = fragments;
    }

//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//        final View view = layoutInflater.inflate(R.layout.newshot_fragment, container, false);
//        container.addView(view);
//        return view;
//    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
//    }


    @Override
    public Fragment getItem(int position) {
        if(data.get(position).equals("推荐")) {
            return fragments.get(position);
        }else {
            NewsFragment newsFragment = new NewsFragment();
            //判断所选的标题，进行传值显示
            Bundle bundle = new Bundle();
            if (data.get(position).equals("美食")) {
                bundle.putString("name", "news_food");
            } else if (data.get(position).equals("娱乐")) {
                bundle.putString("name", "news_entertainment");
            } else if (data.get(position).equals("科技")) {
                bundle.putString("name", "news_tech");
            } else if (data.get(position).equals("财经")) {
                bundle.putString("name", "news_finance");
            } else if (data.get(position).equals("旅游")) {
                bundle.putString("name", "news_travel");
            } else if (data.get(position).equals("体育")) {
                bundle.putString("name", "news_sports");
            } else if (data.get(position).equals("国际")) {
                bundle.putString("name", "news_world");
            }
            newsFragment.setArguments(bundle);
            return newsFragment;
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view == object;
//    }
    @Override
    public CharSequence getPageTitle(int position) {
        return data.get(position);
    }
}

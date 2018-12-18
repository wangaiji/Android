package com.example.lenovo.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return fragments.get(position);
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

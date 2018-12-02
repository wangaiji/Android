package com.example.lenovo.iciba;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SearchView;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FirstFragment firstFragment;
    private IncFragment incFragment;
    private UserFragment userFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch(menuItem.getItemId()) {
                case R.id.item_first:
                    showNav(R.id.item_first);
                    return true;
                case R.id.item_inc:
                    showNav(R.id.item_inc);
                    return true;
                case R.id.item_user:
                    showNav(R.id.item_user);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        bottomNavigationView = findViewById(R.id.bottomBar);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void init(){
        firstFragment = new FirstFragment();
        incFragment = new IncFragment();
        userFragment = new UserFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,firstFragment).add(R.id.frameLayout,incFragment).add(R.id.frameLayout,userFragment);
        fragmentTransaction.hide(firstFragment).hide(incFragment).hide(userFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        showNav(R.id.item_first);
    }

    private void showNav(int navid){
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        switch (navid){
            case R.id.item_first:
                beginTransaction.hide(incFragment).hide(userFragment);
                beginTransaction.show(firstFragment);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;
            case R.id.item_inc:
                beginTransaction.hide(firstFragment).hide(userFragment);
                beginTransaction.show(incFragment);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;
            case R.id.item_user:
                beginTransaction.hide(incFragment).hide(firstFragment);
                beginTransaction.show(userFragment);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;
        }
    }

}











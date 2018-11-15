package com.example.administrator.first;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;


public class AppbarLayoutActivity extends AppCompatActivity {

    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private AppBarLayout mAppBarLayout;
    private TabLayout mTablayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);
        mTablayout = findViewById(R.id.tablayout);
        mViewPager = findViewById(R.id.viewpager);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbarlayout);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

            }
        });

        ArrayList<Fragment> fragmentList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
        fragmentList.add(new OneFragment());
        fragmentList.add(new OneFragment());
        fragmentList.add(new OneFragment());
        titleList.add("直播");
        titleList.add("视频");
        titleList.add("赛事预告");
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),AppbarLayoutActivity.this,fragmentList,titleList));
        mTablayout.setupWithViewPager(mViewPager);



    }
}

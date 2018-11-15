package com.example.administrator.first;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/8/008.
 */

public class OneFragment extends BaseFragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected int setView() {
        return R.layout.fragment_one;
    }

    @Override
    protected void init(View view) {
        viewPager = view.findViewById(R.id.viewpager1);
        tabLayout = view.findViewById(R.id.tablayout1);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        ArrayList<Fragment> fragmentList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
        fragmentList.add(new TwoFragment());
        fragmentList.add(new TwoFragment());
        fragmentList.add(new TwoFragment());
        titleList.add("wws");
        titleList.add("视sds频");
        titleList.add("sdss");
        viewPager.setAdapter(new MyPagerAdapter(getChildFragmentManager(),getActivity(),fragmentList,titleList));
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void initEvent() {

    }
}

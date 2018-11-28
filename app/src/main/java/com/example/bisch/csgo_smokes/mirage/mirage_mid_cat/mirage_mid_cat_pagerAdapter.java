package com.example.bisch.csgo_smokes.mirage.mirage_mid_cat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class mirage_mid_cat_pagerAdapter extends FragmentStatePagerAdapter {

    int mNumberOfTabs;

    public mirage_mid_cat_pagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNumberOfTabs = NumberOfTabs;


    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mirage_mid_cat_vid vid = new mirage_mid_cat_vid();
                return vid;
            case 1:
                mirage_mid_cat_step1 one = new mirage_mid_cat_step1();
                return one;
            case 2:
                mirage_mid_cat_step2 two = new mirage_mid_cat_step2();
                return two;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}

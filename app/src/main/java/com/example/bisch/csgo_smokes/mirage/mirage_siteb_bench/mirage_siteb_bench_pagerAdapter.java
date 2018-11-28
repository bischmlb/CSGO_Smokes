package com.example.bisch.csgo_smokes.mirage.mirage_sitea_ct;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class mirage_sitea_ct_pagerAdapter extends FragmentStatePagerAdapter {

    int mNumberOfTabs;

    public mirage_sitea_ct_pagerAdapter(FragmentManager fm, int NumberOfTabs) {
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
                mirage_sitea_ct_vid vid = new mirage_sitea_ct_vid();
                return vid;
            case 1:
                mirage_sitea_ct_step1 one = new mirage_sitea_ct_step1();
                return one;
            case 2:
                mirage_sitea_ct_step2 two = new mirage_sitea_ct_step2();
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
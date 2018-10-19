package com.example.bisch.csgo_smokes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNumberOfTabs = NumberOfTabs;


    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mirage_siteA A = new mirage_siteA();
                return A;
            case 1:
                Mid mid = new Mid();
                return mid;
            case 2:
                mirage_siteB B = new mirage_siteB();
                return B;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
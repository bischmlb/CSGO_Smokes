package com.example.bisch.csgo_smokes;

import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.bisch.csgo_smokes.Mid;
import com.example.bisch.csgo_smokes.SiteA;
import com.example.bisch.csgo_smokes.SiteB;

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
                SiteA A = new SiteA();
                return A;
            case 1:
                Mid mid = new Mid();
                return mid;
            case 2:
                SiteB B = new SiteB();
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
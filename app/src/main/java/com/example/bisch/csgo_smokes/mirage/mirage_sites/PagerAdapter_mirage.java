package com.example.bisch.csgo_smokes.mirage.mirage_sites;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_mid;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteA;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteB;

public class PagerAdapter_mirage extends FragmentStatePagerAdapter {

    int mNumberOfTabs;

    public PagerAdapter_mirage(FragmentManager fm, int NumberOfTabs) {
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
                mirage_mid mid = new mirage_mid();
                return mid;
            case 2:
                mirage_siteB B = new mirage_siteB();
                return B;
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
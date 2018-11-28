package com.example.bisch.csgo_smokes.cache;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bisch.csgo_smokes.R;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.PagerAdapter_mirage;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_mid;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteA;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteB;

public class cache extends AppCompatActivity implements mirage_siteA.OnFragmentInteractionListener, mirage_mid.OnFragmentInteractionListener, mirage_siteB.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("A"));
        tabLayout.addTab(tabLayout.newTab().setText("Mid"));
        tabLayout.addTab(tabLayout.newTab().setText("B"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdapter_mirage adapter = new PagerAdapter_mirage(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

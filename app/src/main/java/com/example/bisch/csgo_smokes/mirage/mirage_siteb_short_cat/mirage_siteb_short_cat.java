package com.example.bisch.csgo_smokes.mirage.mirage_siteb_short_cat;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.bisch.csgo_smokes.R;
import com.example.bisch.csgo_smokes.mirage.mirage_siteb_bench.mirage_siteb_bench_pagerAdapter;

public class mirage_siteb_short_cat
        extends AppCompatActivity
        implements mirage_siteb_short_cat_step1.OnFragmentInteractionListener, mirage_siteb_short_cat_step2.OnFragmentInteractionListener, mirage_siteb_short_cat_vid.OnFragmentInteractionListener{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirage_siteb_short_cat);


        TabLayout tabLayout2 = (TabLayout) findViewById(R.id.tablayout);
        tabLayout2.addTab(tabLayout2.newTab().setText("Quick    \nGuide    "));
        tabLayout2.addTab(tabLayout2.newTab().setText("In-depth:\nPosition "));
        tabLayout2.addTab(tabLayout2.newTab().setText("In-depth:\nCrosshair"));
        tabLayout2.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager2 = (ViewPager)findViewById(R.id.pager);
        final mirage_siteb_short_cat_pagerAdapter adapter = new mirage_siteb_short_cat_pagerAdapter(getSupportFragmentManager(),tabLayout2.getTabCount());
        viewPager2.setAdapter(adapter);
        viewPager2.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout2));

        tabLayout2.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
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

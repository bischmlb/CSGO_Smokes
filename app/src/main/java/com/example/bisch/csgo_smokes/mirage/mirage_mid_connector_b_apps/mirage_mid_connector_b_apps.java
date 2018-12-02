package com.example.bisch.csgo_smokes.mirage.mirage_mid_connector_b_apps;

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

public class mirage_mid_connector_b_apps
        extends AppCompatActivity
        implements  mirage_mid_connector_b_apps_step1.OnFragmentInteractionListener, mirage_mid_connector_b_apps_step2.OnFragmentInteractionListener, mirage_mid_connector_b_apps_vid.OnFragmentInteractionListener{

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirage_mid_connector_b_apps);


        TabLayout tabLayout2 = (TabLayout) findViewById(R.id.tablayout);
        tabLayout2.addTab(tabLayout2.newTab().setText("Quick    \nGuide    "));
        tabLayout2.addTab(tabLayout2.newTab().setText("In-depth:\nPosition "));
        tabLayout2.addTab(tabLayout2.newTab().setText("In-depth:\nCrosshair"));
        tabLayout2.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager2 = (ViewPager)findViewById(R.id.pager);
        final mirage_mid_connector_b_apps_pagerAdapter adapter = new mirage_mid_connector_b_apps_pagerAdapter(getSupportFragmentManager(),tabLayout2.getTabCount());
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

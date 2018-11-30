package com.example.bisch.csgo_smokes.mirage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.bisch.csgo_smokes.R;
import com.example.bisch.csgo_smokes.mirage.mirage_mid_cat.mirage_mid_cat;
import com.example.bisch.csgo_smokes.mirage.mirage_mid_connector_b_apps.mirage_mid_connector_b_apps;
import com.example.bisch.csgo_smokes.mirage.mirage_mid_window_b_apps.mirage_mid_window_b_apps;
import com.example.bisch.csgo_smokes.mirage.mirage_mid_window_t_spawn.mirage_mid_window_t_spawn;
import com.example.bisch.csgo_smokes.mirage.mirage_sitea_con_jun.mirage_sitea_con_jun;
import com.example.bisch.csgo_smokes.mirage.mirage_sitea_ct.mirage_sitea_ct;
import com.example.bisch.csgo_smokes.mirage.mirage_sitea_stairs.mirage_sitea_stairs;
import com.example.bisch.csgo_smokes.mirage.mirage_siteb_bench.mirage_siteb_bench;
import com.example.bisch.csgo_smokes.mirage.mirage_siteb_market_window.mirage_siteb_market_window;
import com.example.bisch.csgo_smokes.mirage.mirage_siteb_short_cat.mirage_siteb_short_cat;
import com.example.bisch.csgo_smokes.mirage.mirage_siteb_under_balc.mirage_siteb_under_balc;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.PagerAdapter_mirage;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_mid;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteA;
import com.example.bisch.csgo_smokes.mirage.mirage_sites.mirage_siteB;

public class mirage
        extends AppCompatActivity
        implements mirage_siteA.OnFragmentInteractionListener,
        mirage_siteB.OnFragmentInteractionListener,
        mirage_mid.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirage);


        final SwitchCompat SW = (SwitchCompat) findViewById(R.id.switch1);
        final SwitchCompat SW2 = (SwitchCompat) findViewById(R.id.switch2);
        final SwitchCompat SW3 = (SwitchCompat) findViewById(R.id.switch3);
        final ImageView IV = (ImageView) findViewById(R.id.overView);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);






        tabLayout.addTab(tabLayout.newTab().setText("A"));
        tabLayout.addTab(tabLayout.newTab().setText("MID"));
        tabLayout.addTab(tabLayout.newTab().setText("B"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final Button stairs = (Button) findViewById(R.id.btn_stairs);
        stairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mirage.this, mirage_sitea_stairs.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }

        });

        final Button con_jun = (Button) findViewById(R.id.btn_con_jun);
        con_jun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mirage.this, mirage_sitea_con_jun.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button ct = (Button) findViewById(R.id.btn_ct_spawn);
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_sitea_ct.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button catSmoke = (Button) findViewById(R.id.btn_cat);
        catSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_mid_cat.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });
        final Button window_tspawn = (Button) findViewById(R.id.btn_window);
        window_tspawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_mid_window_t_spawn.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button window_b_apps = (Button) findViewById(R.id.btn_window_b_apps);
        window_b_apps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_mid_window_b_apps.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });


        final Button connector_b_apps = (Button) findViewById(R.id.btn_connector);
        connector_b_apps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_mid_connector_b_apps.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button bench = (Button) findViewById(R.id.btn_bench);
        bench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_siteb_bench.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button market_window = (Button) findViewById(R.id.btn_market_window);
        market_window.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_siteb_market_window.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button under_balc = (Button) findViewById(R.id.btn_under_balc);
        under_balc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_siteb_under_balc.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

        final Button short_cat = (Button) findViewById(R.id.btn_short_cat);
        short_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mirage.this, mirage_siteb_short_cat.class), ActivityOptions.makeSceneTransitionAnimation(mirage.this).toBundle());
            }
        });

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
/*
        int[] imageResId = {
                R.drawable.smokegrenade,
                R.drawable.smokegrenade,
                R.drawable.smokegrenade };

        for (int i = 0; i < imageResId.length; i++){
            tabLayout.getTabAt(i).setIcon(imageResId[i]);

        }


*/

        SW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean switchState) {
                if(switchState){
                    IV.setImageResource(R.drawable.mirage_ov2_1);
                    Toast.makeText(mirage.this, "Positions are now shown", Toast.LENGTH_SHORT).show();
                }else{
                    IV.setImageResource(R.drawable.mirage_ov);
                    Toast.makeText(mirage.this, "Positions are now hidden", Toast.LENGTH_SHORT).show();
                }

            }
        });

        SW2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    viewPager.setVisibility(View.VISIBLE);
                    //tabLayout.setVisibility(View.VISIBLE);
                    Toast.makeText(mirage.this, "The helper-menu is now shown", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setVisibility(View.GONE);
                    //tabLayout.setVisibility(View.GONE);
                    Toast.makeText(mirage.this, "The helper-menu is now hidden", Toast.LENGTH_SHORT).show();
                }
            }
        });


        SW3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    window_tspawn.setVisibility(View.GONE);
                    short_cat.setVisibility(View.GONE);
                    Toast.makeText(mirage.this, "Easy mode ON", Toast.LENGTH_SHORT).show();
                } else {
                    window_tspawn.setVisibility(View.VISIBLE);
                    short_cat.setVisibility(View.VISIBLE);
                    Toast.makeText(mirage.this, "Easy mode OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ColorStateList trackStates = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_enabled},
                        new int[]{}
                },
                new int[]{
                        Color.YELLOW,
                        Color.LTGRAY
                }
        );

        SW.setTrackTintList(trackStates);
        SW2.setTrackTintList(trackStates);
        SW3.setTrackTintList(trackStates);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

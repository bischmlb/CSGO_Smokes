package com.example.bisch.csgo_smokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button dust2Btn = (Button) findViewById(R.id.btn_dust2);
       final Button mirageBtn = (Button) findViewById(R.id.btn_mirage);
       final Button cacheBtn = (Button) findViewById(R.id.btn_cache);
       final Button overpassBtn = (Button) findViewById(R.id.btn_overpass);
       final Button trainBtn = (Button) findViewById(R.id.btn_train);
       final Button nukeBtn = (Button) findViewById(R.id.btn_nuke);
       final Button infernoBtn = (Button) findViewById(R.id.btn_inferno);
       final Button cbbleBtn = (Button) findViewById(R.id.btn_cbble);

        dust2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, dust2.class));
            }
        });
        mirageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, mirage.class));
            }
        });
        cacheBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, cache.class));
            }
        });
        overpassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        trainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        nukeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        infernoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cbbleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}

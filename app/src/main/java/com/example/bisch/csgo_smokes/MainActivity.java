package com.example.bisch.csgo_smokes;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.bisch.csgo_smokes.cache.cache;
import com.example.bisch.csgo_smokes.dust2.dust2;
import com.example.bisch.csgo_smokes.mirage.mirage;

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

        dust2Btn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        cacheBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        overpassBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        trainBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        nukeBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        infernoBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        cbbleBtn.setPaintFlags(dust2Btn.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



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

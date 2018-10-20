package com.example.bisch.csgo_smokes;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class mirage_siteb_under_balc extends AppCompatActivity {

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirage_siteb_under_balc);

        videoView = (VideoView) findViewById(R.id.videoView);

        if(mediaController == null) {
            mediaController = new MediaController(mirage_siteb_under_balc.this);

            mediaController.setAnchorView(videoView);

            videoView.setMediaController(mediaController);
        }

        try {//TODO
            int id = this.getRawResIdByName("short_gtr_safe_drop_smoke");
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + id));
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                videoView.seekTo(position);
                if(position == 0) {
                    videoView.start();
                }

                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i1) {
                        mediaController.setAnchorView(videoView);
                    }
                });

            }
        });

    }

    public int getRawResIdByName(String resName){
        String pkgName = this.getPackageName();

        int resID = this.getResources().getIdentifier(resName, "raw",pkgName);
        Log.i("AndroidViewView", "Res Name: " + resName + "==> es ID = " + resID);
        return resID;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("CurrentPosition", videoView.getCurrentPosition());
        videoView.pause();
    }

    public void onRestoreInsanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        position = savedInstanceState.getInt("CurrentPosition");
        videoView.seekTo(position);
    }
}

package com.bsit4.learnbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class SupplementaryVids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Status and Action Bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.sky));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.sky)));

        setContentView(R.layout.activity_supplementary_vids);

        //menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.btmnav);
        bottomNavigationView.setSelectedItemId(R.id.suppvid);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.suppvid:
                        return true;
                }
                return false;
            }
        });

        //youtube
        YouTubePlayerView html = findViewById(R.id.html);
        getLifecycle().addObserver(html);
        html.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer){
                String videoId = "ok-plXXHlWw";
                youTubePlayer.loadVideo(videoId,0);
                youTubePlayer.pause();
            }
        });
        YouTubePlayerView css = findViewById(R.id.css);
        getLifecycle().addObserver(html);
        css.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer){
                String videoId = "OEV8gMkCHXQ";
                youTubePlayer.loadVideo(videoId,0);
                youTubePlayer.pause();
            }
        });
        YouTubePlayerView js = findViewById(R.id.javascript);
        getLifecycle().addObserver(html);
        js.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer){
                String videoId = "DHjqpvDnNGE";
                youTubePlayer.loadVideo(videoId,0);
                youTubePlayer.pause();
            }
        });
        YouTubePlayerView php = findViewById(R.id.php);
        getLifecycle().addObserver(html);
        php.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer){
                String videoId = "a7_WFUlFS94";
                youTubePlayer.loadVideo(videoId,0);
                youTubePlayer.pause();
            }
        });


    }
}
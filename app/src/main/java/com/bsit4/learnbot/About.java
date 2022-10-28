package com.bsit4.learnbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class About extends AppCompatActivity {
    ImageButton aira;
    ImageButton kennith;
    ImageButton christian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Status and Action Bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.sky));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.sky)));
        setContentView(R.layout.activity_about);

        //menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.btmnav);
        bottomNavigationView.setSelectedItemId(R.id.about);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.suppvid:
                        startActivity(new Intent(getApplicationContext(), SupplementaryVids.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.about:
                        return true;
                }
                return false;
            }
        });

        // Images to FB link
        aira = findViewById(R.id.aira);
        kennith = findViewById(R.id.kennith);
        christian =  findViewById(R.id.christian);

        aira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100075725247743");
            }
        });
        kennith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/profile.php?id=100008896574201");
            }
        });
        christian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.facebook.com/chrstnqrmt");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
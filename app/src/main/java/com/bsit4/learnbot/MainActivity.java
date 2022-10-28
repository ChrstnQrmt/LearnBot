package com.bsit4.learnbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Status and Action Bar
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.sky));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.sky)));

        setContentView(R.layout.activity_main);

        //menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.btmnav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.suppvid:
                    startActivity(new Intent(getApplicationContext(), SupplementaryVids.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.about:
                    startActivity(new Intent(getApplicationContext(), About.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.home:
                    return true;
            }
                return false;
        }
        });

        //main icon image button functions
        imgbtn = (ImageButton) findViewById(R.id.htmlbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHTML();
            }
        });
        imgbtn = (ImageButton) findViewById(R.id.cssbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCSS();
            }
        });
        imgbtn = (ImageButton) findViewById(R.id.jsbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJS();
            }
        });
        imgbtn = (ImageButton) findViewById(R.id.phpbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPHP();
            }
        });
    }
    public void openPHP(){
        Intent intent = new Intent(this, PHP.class);
        startActivity(intent);
    }
    public void openJS(){
        Intent intent = new Intent(this, JS.class);
        startActivity(intent);
    }
    public void openCSS(){
        Intent intent = new Intent(this, CSS.class);
        startActivity(intent);
    }
    public void openHTML(){
        Intent intent = new Intent(this, HTML.class);
        startActivity(intent);
    }
}
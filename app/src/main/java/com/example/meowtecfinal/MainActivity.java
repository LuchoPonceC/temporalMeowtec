package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar


        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://"+getPackageName() + "/" + R.raw.meowtec_video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();




        //Iniciaalizar y asignar variable

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Setear Home como seleccionado
        bottomNavigationView.setSelectedItemId(R.id.inicio);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.albergues:
                        startActivity(new Intent(getApplicationContext(), Albergues.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.inicio:
                        return true;

                    case R.id.adopta:
                        startActivity(new Intent(getApplicationContext(), Adopta.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nosotros:
                        startActivity(new Intent(getApplicationContext(), Nosotros.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();



    }





}

package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosotros);



        





        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Setear Home como seleccionado
        bottomNavigationView.setSelectedItemId(R.id.nosotros);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.albergues:
                        startActivity(new Intent(getApplicationContext(), Albergues.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.inicio:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.adopta:
                        startActivity(new Intent(getApplicationContext(), Adopta.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nosotros:
                        return true;
                }

                return false;
            }
        });


    }



}

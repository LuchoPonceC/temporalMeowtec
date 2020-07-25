package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.meowtecfinal.model.AlbergueDetails;
import com.example.meowtecfinal.model.AlbergueModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Albergues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albergues);

        ListView listView = (ListView) findViewById(R.id.list_albergue_view);
        ArrayList<AlbergueModel> albergueModels = AlbergueDetails.getAlbergues();
        AdapterAlbergue albergueAdapter = new AdapterAlbergue(Albergues.this, albergueModels);
        listView.setAdapter(albergueAdapter);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);



        //Setear Home como seleccionado
        bottomNavigationView.setSelectedItemId(R.id.albergues);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.albergues:
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
                        startActivity(new Intent(getApplicationContext(), Nosotros.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }




}

package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.meowtecfinal.model.AdoptaDetails;
import com.example.meowtecfinal.model.AdoptaModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Adopta extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopta);

        ListView listview = (ListView) findViewById(R.id.list_adopta_view);
        ArrayList<AdoptaModel> adoptaModels = AdoptaDetails.getAdopta();
        AdapterAdopta adoptaAdapter = new AdapterAdopta(Adopta.this,adoptaModels);
        listview.setAdapter(adoptaAdapter);



        //Iniciaalizar y asignar variable

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Setear Home como seleccionado
        bottomNavigationView.setSelectedItemId(R.id.adopta);

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

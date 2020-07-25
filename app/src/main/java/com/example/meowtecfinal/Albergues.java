package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.meowtecfinal.model.AlbergueDetails;
import com.example.meowtecfinal.model.AlbergueModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;

import java.util.ArrayList;

public class Albergues extends AppCompatActivity {

    JSONArray albergues;
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albergues);

        //ListView listView = (ListView) findViewById(R.id.list_albergue_view);
        mRecyclerView = findViewById(R.id.main_recycler_view);



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

    @Override
    protected void onResume() {
        super.onResume();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        getAlbergues();

    }

    public void getAlbergues(){
        String url = "http://52.67.175.153:8080/get_albergues";
        JsonArrayRequest request = new JsonArrayRequest(
                Request.Method.GET,
                url,
                new JSONArray(),
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        mAdapter = new AdapterAlbergue(response, getActivty());
                        mRecyclerView.setAdapter(mAdapter);
                        System.out.println(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        System.out.println(error);

                    }
                }
        );

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }

    public Activity getActivty(){
        return this;
    }
    public void showMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void goMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}



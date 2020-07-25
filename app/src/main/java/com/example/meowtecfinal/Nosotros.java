package com.example.meowtecfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

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

    public void enviar(View view){
        String url = "http://52.67.175.153:8080/contacto";
        String nombre = ((EditText)findViewById(R.id.editTextTextPersonName1)).getText().toString();
        String apellido = ((EditText)findViewById(R.id.editTextTextPersonName2)).getText().toString();
        String celular = ((EditText)findViewById(R.id.editTextPhone)).getText().toString();
        String correo = ((EditText)findViewById(R.id.editTextTextEmailAddress2)).getText().toString();
        String mensaje = ((EditText)findViewById(R.id.editTextTextMultiLine)).getText().toString();
        Map<String, String> message = new HashMap<String, String>();
        message.put("nombre", nombre);
        message.put("apellidos", apellido);
        message.put("celular", celular);
        message.put("correo", correo);
        message.put("mensaje", mensaje);

        JSONObject jsonMessage = new JSONObject(message);
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST,
                url,
                jsonMessage,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        showMessage("Enviado con exito");
                        goMainActivity();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);


    }

    public void showMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void goMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

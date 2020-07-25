package com.example.meowtecfinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meowtecfinal.model.AlbergueModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AdapterAlbergue extends RecyclerView.Adapter<AdapterAlbergue.ViewHolder> {

    private Context context;
    public JSONArray albergues;

    //private ArrayList<AlbergueModel> albergueModels;

    public AdapterAlbergue(JSONArray jsonArray, Context context){
        this.context = context;
        this.albergues = jsonArray;
    }

    @Override
    public int getItemCount() {
        return albergues.length();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_albergues,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final JSONObject albergue;
        try {
            albergue = albergues.getJSONObject(position);
            String nombre = albergue.getString("nombre_albergues");
            String representante = albergue.getString("nombre");
            String ciudad = albergue.getString("ciudad");
            int fecha = albergue.getInt("anios");
            int total_gatos = albergue.getInt("num_gatos");
            String tipo_albergue = albergue.getString("albergan");
            String telefono = albergue.getString("telefono");
            //holder.images.setImageResource(albergue.get);
            holder.name.setText(nombre);
            holder.name.setText(representante);
            holder.name.setText(ciudad);
            holder.name.setText("Desde " +Integer.toString(2020 - fecha));
            holder.name.setText(Integer.toString(total_gatos));
            holder.name.setText(tipo_albergue);
            holder.name.setText(telefono);


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }




    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView images ;
        TextView name ;
        TextView tipo ;
        TextView place ;
        TextView date ;
        TextView size;
        TextView rName;
        TextView rNumber;

        RelativeLayout container;

        public ViewHolder(View itemView){
            super(itemView);

             images = itemView.findViewById(R.id.imageAlbergue);
             name = itemView.findViewById(R.id.albergueName);
             tipo = itemView.findViewById(R.id.albergueTipo);
             place = itemView.findViewById(R.id.alberguePlace);
             date = itemView.findViewById(R.id.albergueDate);
             size = itemView.findViewById(R.id.albergueSize);
             rName = itemView.findViewById(R.id.albergueRName);
             rNumber = itemView.findViewById(R.id.albergueRNumber);


        }

    }



}



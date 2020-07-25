package com.example.meowtecfinal.model;

import com.example.meowtecfinal.R;

import java.util.ArrayList;

public class AlbergueDetails {

    public static ArrayList<AlbergueModel> getAlbergues(){
        ArrayList<AlbergueModel> alberguesList = new ArrayList<>();

        alberguesList.add(new AlbergueModel(R.drawable.gato1,"Albergue 1","Este es el alberguito1","Lima","20 Marzo",
                "100 Gatos Rescatos","Pepito 2 Cañones","123"));
        alberguesList.add(new AlbergueModel(R.drawable.gato2,"Albergue 2","Este es el alberguito2","Chincha","15 Marzo",
                "40 Gatos Rescatos", "Jorgito Perez","3214"));
        alberguesList.add(new AlbergueModel(R.drawable.gato3,"Albergue 3","Este es el alberguito3","Huaraz","10 Febrero",
                "200 Gatos Rescatos", "Carlitos Perez","5555"));
        alberguesList.add(new AlbergueModel(R.drawable.gato4,"Albergue 4","Este es el alberguito4","Huancayo", "10 Enero",
                "150 Gatos Rescatos","Jorgito Suarez","11234"));
        alberguesList.add(new AlbergueModel(R.drawable.gato5,"Albergue 5","Este es el alberguito5","SMP","2 Abril",
                "20 Gatos Rescatos","Luis Chicho","11234"));




        return alberguesList;
    }


}

package com.example.meowtecfinal.model;

import com.example.meowtecfinal.R;

import java.util.ArrayList;

public class AlbergueDetails {

    public static ArrayList<Model> getAlbergues(){
        ArrayList<Model> alberguesList = new ArrayList<>();

        alberguesList.add(new Model(R.drawable.gato1,"Albergue 1","Este es el alberguito1"));
        alberguesList.add(new Model(R.drawable.gato2,"Albergue 2","Este es el alberguito2"));
        alberguesList.add(new Model(R.drawable.gato3,"Albergue 3","Este es el alberguito3"));
        alberguesList.add(new Model(R.drawable.gato4,"Albergue 4","Este es el alberguito4"));
        alberguesList.add(new Model(R.drawable.gato5,"Albergue 5","Este es el alberguito5"));




        return alberguesList;
    }


}

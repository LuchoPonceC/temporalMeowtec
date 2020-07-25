package com.example.meowtecfinal.model;

import android.content.Context;

import com.example.meowtecfinal.R;

import java.util.ArrayList;

public class AdoptaDetails {
    public static ArrayList<AdoptaModel> getAdopta(){
        ArrayList<AdoptaModel> adoptaList = new ArrayList<>();

        adoptaList.add(new AdoptaModel(R.drawable.gato1,R.drawable.gato2,"Bebesito","Bebesito6","2 meses","2meses"));

        adoptaList.add(new AdoptaModel(R.drawable.gato2,R.drawable.gato3,"Bebesito1","Bebesito5","4 meses","4meses"));

        adoptaList.add(new AdoptaModel(R.drawable.gato4,R.drawable.gato5,"Bebesito2","Bebesito4","6 meses","6meses"));

        adoptaList.add(new AdoptaModel(R.drawable.gato1,R.drawable.gato2,"Bebesito3","Bebesito3","8 meses","8 meses"));

        adoptaList.add(new AdoptaModel(R.drawable.gato2,R.drawable.gato3,"Bebesito4","Bebesito2","10 meses","10 meses"));

        adoptaList.add(new AdoptaModel(R.drawable.gato3,R.drawable.gato4,"Bebesito5","Bebesito1","12 meses","12 meses"));



        return adoptaList;
    }
}

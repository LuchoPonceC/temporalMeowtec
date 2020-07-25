package com.example.meowtecfinal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.meowtecfinal.model.AdoptaModel;
import com.example.meowtecfinal.model.AlbergueModel;

import java.util.ArrayList;

public class AdapterAdopta extends BaseAdapter {

    private Context context;
    private ArrayList<AdoptaModel> adoptaModels;

    public AdapterAdopta(Context context, ArrayList<AdoptaModel> adoptaModels) {
        this.context = context;
        this.adoptaModels = adoptaModels;
    }

    @Override
    public int getCount() {

        return adoptaModels.size();
    }

    @Override
    public Object getItem(int position) {
        return adoptaModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            view = View.inflate(context , R.layout.list_adopta, null);
        }

        ImageView images1 = (ImageView)view.findViewById(R.id.adoptaImage1);
        ImageView images2 = (ImageView)view.findViewById(R.id.adoptaImage2);
        TextView catName1 = (TextView)view.findViewById(R.id.catName1);
        TextView catName2 = (TextView)view.findViewById(R.id.catName2);
        TextView catAge1 = (TextView)view.findViewById(R.id.catAge1);
        TextView catAge2 = (TextView)view.findViewById(R.id.catAge2);

        AdoptaModel adoptaModel = adoptaModels.get(position);
        images1.setImageResource(adoptaModel.getAdoptaImage1());
        images2.setImageResource(adoptaModel.getAdoptaImage2());
        catName1.setText(adoptaModel.getCatName1());
        catName2.setText(adoptaModel.getCatName2());
        catAge1.setText(adoptaModel.getCatAge1());
        catAge2.setText(adoptaModel.getCatAge2());



        return view;
    }
}

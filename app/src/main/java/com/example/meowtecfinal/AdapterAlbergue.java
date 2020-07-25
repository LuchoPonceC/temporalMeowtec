package com.example.meowtecfinal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.meowtecfinal.model.AlbergueModel;

import java.util.ArrayList;

public class AdapterAlbergue extends BaseAdapter {

    private Context context;
    private ArrayList<AlbergueModel> albergueModels;

    AdapterAlbergue(Context context, ArrayList<AlbergueModel> albergueModels ){
        this.context = context;
        this.albergueModels = albergueModels;
    }

    @Override
    public int getCount() {
        return albergueModels.size();
    }

    @Override
    public Object getItem(int position) {
        return albergueModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            view = View.inflate(context , R.layout.list_albergues, null);
        }

        ImageView images = (ImageView)view.findViewById(R.id.imageAlbergue);
        TextView name = (TextView)view.findViewById(R.id.albergueName);
        TextView tipo = (TextView)view.findViewById(R.id.albergueTipo);
        TextView place = (TextView)view.findViewById(R.id.alberguePlace);
        TextView date = (TextView)view.findViewById(R.id.albergueDate);
        TextView size = (TextView)view.findViewById(R.id.albergueSize);
        TextView rName = (TextView)view.findViewById(R.id.albergueRName);
        TextView rNumber = (TextView)view.findViewById(R.id.albergueRNumber);

        AlbergueModel albergueModel = albergueModels.get(position);
        images.setImageResource(albergueModel.getAlbergueImage());
        name.setText(albergueModel.getAlbergueName());
        tipo.setText(albergueModel.getAlbergueTipo());
        place.setText(albergueModel.getAlberguePlace());
        date.setText(albergueModel.getAlbergueDate());
        size.setText(albergueModel.getAlbergueSize());
        rName.setText(albergueModel.getAlbergueRName());
        rNumber.setText(albergueModel.getAlbergueRNumber());



        return view;
    }
}

;

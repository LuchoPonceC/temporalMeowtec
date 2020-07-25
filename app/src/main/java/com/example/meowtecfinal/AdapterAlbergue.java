package com.example.meowtecfinal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.meowtecfinal.model.Model;

import java.util.ArrayList;

public class AdapterAlbergue extends BaseAdapter {

    private Context context;
    private ArrayList<Model> models;

    AdapterAlbergue(Context context, ArrayList<Model> models){
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
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

        ImageView images = (ImageView)view.findViewById(R.id.movieimageView);
        TextView title = (TextView)view.findViewById(R.id.movienameTV);
        TextView about = (TextView)view.findViewById(R.id.moviedescTV);
        Model model = models.get(position);
        images.setImageResource(model.getMovieImage());
        title.setText(model.getMovieTitle());
        about.setText(model.getAboutMovie());



        return view;
    }
}

;

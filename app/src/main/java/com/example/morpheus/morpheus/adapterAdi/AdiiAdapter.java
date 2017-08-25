package com.example.morpheus.morpheus.adapterAdi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.morpheus.morpheus.R;
import com.example.morpheus.morpheus.modeloAdi.AdiiListView;

import java.util.ArrayList;

/**
 * Created by Adrii on 25/08/2017.
 */

public class AdiiAdapter extends BaseAdapter {
    private ArrayList<AdiiListView> elementos;
    private Context context;

    public AdiiAdapter(ArrayList<AdiiListView> elementos, Context context) {
        this.elementos = elementos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return elementos.size();
    }

    @Override
    public AdiiListView getItem(int i) {
        return elementos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        //infla el layout
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.adi_template, null);

        }

        //Relaciona cada elemento con su view
        TextView opcion = (TextView) view.findViewById(R.id.opcion);


        //Coloca los valores de cada elemento
        opcion.setText(getItem(i).getOpcion());


        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.adi_template, null);

        }

        //Relaciona cada elemento con su view
        TextView opcion = (TextView) view.findViewById(R.id.opcion);


        //Coloca los valores de cada elemento
        opcion.setText(getItem(position).getOpcion());


        return view;
    }
}

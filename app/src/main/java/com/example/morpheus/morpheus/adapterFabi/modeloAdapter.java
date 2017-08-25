package com.example.morpheus.morpheus.adapterFabi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.morpheus.morpheus.R;
import com.example.morpheus.morpheus.modeloFabi.modelo;

import java.util.ArrayList;

/**
 * Created by Fabi on 25/08/2017.
 */

public class modeloAdapter extends BaseAdapter {
    private ArrayList<modelo> elementos;
    private Context context;

    public modeloAdapter(ArrayList<modelo> elementos, Context context) {
        this.elementos = elementos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return elementos.size();
    }

    //crea un objeto de la clase Cultura solamente
    // regresa el elemeto en la posicion de la lista
    @Override
    public modelo getItem(int i) {
        return elementos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //infla el layout
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = convertView;
        if(convertView == null){
            view = inflater.inflate(R.layout.fabiadapter, null);
        }
        //Relaciona cada elemento con su view
        TextView titulo = (TextView) view.findViewById(R.id.titulo);



        //Coloca los valores de cada elemento
        titulo.setText(getItem(position).getNombre());


        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = convertView;
        if(convertView == null){
            view = inflater.inflate(R.layout.fabiadapter, null);
        }
        TextView titulo = (TextView)view.findViewById(R.id.titulo);

        titulo.setText(getItem(position).getNombre());
        return view;
    }
}

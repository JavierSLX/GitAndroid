package com.example.morpheus.morpheus.adapterAngel;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.morpheus.morpheus.R;
import com.example.morpheus.morpheus.modeloAngel.OpcionAngel;

import java.util.List;

/**
 * Created by Dulcinea on 25/08/2017.
 */

public class OpcionAngelAdapter extends ArrayAdapter<OpcionAngel> {
    public OpcionAngelAdapter(Context context,List<OpcionAngel> objetos) {
        super(context, R.layout.spinner_angel_template,objetos);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View elemento=inflater.inflate(R.layout.spinner_angel_template,null);
        TextView titulo=(TextView)elemento.findViewById(R.id.titulo);
        titulo.setText(getItem(position).getOpcion());
        return elemento;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View elemento=inflater.inflate(R.layout.spinner_angel_template,null);
        TextView titulo=(TextView)elemento.findViewById(R.id.titulo);
        titulo.setText(getItem(position).getOpcion());
        return elemento;
    }
}

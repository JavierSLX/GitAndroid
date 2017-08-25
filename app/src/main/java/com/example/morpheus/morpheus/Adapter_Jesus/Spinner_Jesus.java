package com.example.morpheus.morpheus.Adapter_Jesus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.morpheus.morpheus.R;

import java.util.ArrayList;

/**
 * Created by alberto on 25/08/2017.
 */

public class Spinner_Jesus extends BaseAdapter{
    private ArrayList<String> lista;
    private Context context;

    public Spinner_Jesus(ArrayList<String> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public String getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View item = view;
        if(item == null)
            item = inflater.inflate(R.layout.adapter_jesus, null);

        TextView texto = (TextView)item.findViewById(R.id.texto);

        texto.setText(getItem(i));
        return item;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;
        if(item == null)
            item = inflater.inflate(R.layout.adapter_jesus, null);

        TextView texto = (TextView)item.findViewById(R.id.texto);

        texto.setText(getItem(position));
        return item;
    }
}

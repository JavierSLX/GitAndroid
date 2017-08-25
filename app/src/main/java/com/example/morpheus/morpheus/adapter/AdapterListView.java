package com.example.morpheus.morpheus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.morpheus.morpheus.R;

import java.util.ArrayList;

/**
 * Created by Morpheus on 25/08/2017.
 */

public class AdapterListView extends BaseAdapter
{
    private ArrayList<String> lista;
    private Context context;

    public AdapterListView(ArrayList<String> lista, Context context)
    {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public String getItem(int i)
    {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View item = view;
        if (view == null)
            item = inflater.inflate(R.layout.adapter_template, null);

        //Define el elemento con su view
        TextView texto = (TextView)item.findViewById(R.id.texto);

        //Asigna el valor
        texto.setText(getItem(i));
        texto.setTextColor(viewGroup.getResources().getColor(R.color.colorPrimaryDark));

        return item;
    }
}

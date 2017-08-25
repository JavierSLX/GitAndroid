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

public class AdapterSpinner extends BaseAdapter
{
    private ArrayList<String> lista;
    private Context context;

    public AdapterSpinner(ArrayList<String> lista, Context context)
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
        if (item == null)
            item = inflater.inflate(R.layout.adapter_template, null);

        //Define los elementos con sus view
        TextView texto = (TextView)item.findViewById(R.id.texto);

        //Le coloca valor al textview
        texto.setText(getItem(i));

        return item;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;
        if (item == null)
            item = inflater.inflate(R.layout.adapter_template, null);

        //Define los elementos con sus view
        TextView texto = (TextView)item.findViewById(R.id.texto);

        //Le coloca valor al textview
        texto.setText(getItem(position));

        return item;
    }
}

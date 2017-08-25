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


public class AdaperLisView extends BaseAdapter{
    private ArrayList<String> lista;
    private Context context;

    public AdaperLisView(ArrayList<String> lista, Context context) {
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
        if(view == null)
            item = inflater.inflate(R.layout.adapter_jesus, null );

        TextView texto = (TextView)item.findViewById(R.id.texto);

        texto.setText(getItem(i));
        texto.setTextColor(viewGroup.getResources().getColor(R.color.colorPrimaryDark));
        return item;
    }
}

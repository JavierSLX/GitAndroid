package com.example.morpheus.morpheus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.morpheus.morpheus.Adapter_Jesus.AdaperLisView;
import com.example.morpheus.morpheus.Adapter_Jesus.Spinner_Jesus;

import java.util.ArrayList;

public class Lista_Activity extends AppCompatActivity {
    private Spinner spinner;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_);

        spinner = (Spinner)findViewById(R.id.spinner);
        listView = (ListView)findViewById(R.id.lista);

        Spinner_Jesus spinner_jesus= new Spinner_Jesus(listaMuestreo(),this);
        spinner.setAdapter(spinner_jesus);

        final AdaperLisView adaperLisView = new AdaperLisView(listaMiebros(),this);
        listView.setAdapter(adaperLisView);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                AdaperLisView adaperLisViewM;
                switch(i){
                    case 0:
                        adaperLisViewM = new AdaperLisView(listaDias(), Lista_Activity.this);
                        listView.setAdapter(adaperLisViewM);
                        break;
                    case 1:
                        adaperLisViewM = new AdaperLisView(listaMeses(), Lista_Activity.this);
                        listView.setAdapter(adaperLisViewM);
                        break;
                    case 2:
                        adaperLisViewM = new AdaperLisView(listaMiebros(), Lista_Activity.this);
                        listView.setAdapter(adaperLisViewM);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                AdaperLisView adaperLisViewM;
                adaperLisViewM = new AdaperLisView(listaMiebros(), Lista_Activity.this);
                listView.setAdapter(adaperLisViewM);

            }
        });



    }
    private ArrayList<String> listaMuestreo(){
        ArrayList<String> lista = new ArrayList<>();
        String[] nombres = getResources().getStringArray(R.array.muestreo);

        for(int i = 0; i < nombres.length; i++)
            lista.add(nombres[i]);

        return lista;
    }

    private ArrayList<String> listaMiebros(){
        ArrayList<String> lista = new ArrayList<>();
        String[] nombres = getResources().getStringArray(R.array.Miembros);

        for(int i = 0; i < nombres.length; i++)
            lista.add(nombres[i]);

        return lista;
    }
    private ArrayList<String> listaDias(){
        ArrayList<String> lista = new ArrayList<>();
        String[] nombres = getResources().getStringArray(R.array.Dias);

        for(int i = 0; i < nombres.length; i++)
            lista.add(nombres[i]);

        return lista;
    }
    private ArrayList<String> listaMeses(){
        ArrayList<String> lista = new ArrayList<>();
        String[] nombres = getResources().getStringArray(R.array.Meses);

        for(int i = 0; i < nombres.length; i++)
            lista.add(nombres[i]);

        return lista;
    }

}

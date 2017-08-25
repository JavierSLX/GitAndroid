package com.example.morpheus.morpheus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.morpheus.morpheus.adapter.AdapterListView;
import com.example.morpheus.morpheus.adapter.AdapterSpinner;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        //Relaciona los view con sus objetos
        spinner = (Spinner)findViewById(R.id.spinner);
        listView = (ListView)findViewById(R.id.lista);

        //Crea el adapter y lo asigna al spinner
        AdapterSpinner adapterSpinner = new AdapterSpinner(listarOpciones(), this);
        spinner.setAdapter(adapterSpinner);

        //Crea el adapter del ListView
        AdapterListView adapterListView = new AdapterListView(listarNombres(), this);
        listView.setAdapter(adapterListView);

        //Evento del spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                AdapterListView adapterListViewM;
                switch (i)
                {
                    case 0:
                        adapterListViewM = new AdapterListView(listarNombres(), ListaActivity.this);
                        listView.setAdapter(adapterListViewM);
                        break;

                    case 1:
                        adapterListViewM = new AdapterListView(listarDias(), ListaActivity.this);
                        listView.setAdapter(adapterListViewM);
                        break;

                    default:
                        adapterListViewM = new AdapterListView(listarMeses(), ListaActivity.this);
                        listView.setAdapter(adapterListViewM);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                AdapterListView adapterListViewM;
                adapterListViewM = new AdapterListView(listarNombres(), ListaActivity.this);
                listView.setAdapter(adapterListViewM);
            }
        });

    }

    //Método para sacar las opciones del spinner
    private ArrayList<String> listarOpciones()
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] opciones = getResources().getStringArray(R.array.opciones);

        for (int i = 0; i < opciones.length; i++)
            lista.add(opciones[i]);

        return lista;
    }

    //Lista los nombres para la listview
    private ArrayList<String> listarNombres()
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] nombres = getResources().getStringArray(R.array.nombres);

        for (int i = 0; i < nombres.length; i++)
            lista.add(nombres[i]);

        return lista;
    }

    //Lista los dias para la listview
    private ArrayList<String> listarDias()
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] dias = getResources().getStringArray(R.array.semana);

        for (int i = 0; i < dias.length; i++)
            lista.add(dias[i]);

        return lista;
    }

    //Lista los meses para la listview
    private ArrayList<String> listarMeses()
    {
        ArrayList<String> lista = new ArrayList<>();
        String[] meses = getResources().getStringArray(R.array.meses);

        for (int i = 0; i < meses.length; i++)
            lista.add(meses[i]);

        return lista;
    }
}

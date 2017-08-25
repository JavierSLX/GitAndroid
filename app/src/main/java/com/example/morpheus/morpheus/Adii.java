package com.example.morpheus.morpheus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.morpheus.morpheus.adapterAdi.AdiiAdapter;
import com.example.morpheus.morpheus.modeloAdi.AdiiListView;

import java.util.ArrayList;

public class Adii extends AppCompatActivity {
 private Spinner spinner;
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adii);

        //Define cada elemento con su view
        spinner = (Spinner) findViewById(R.id.spinner);
        lista = (ListView)findViewById(R.id.lista);
        //crea el adapter
        AdiiAdapter adapter = new AdiiAdapter(listar(), this);
        spinner.setAdapter(adapter);

        //Evento cuando selecciona un elemento del spinne
        //saca el arreglo de elementos de la imagen

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        AdiiAdapter adapter0 = new AdiiAdapter(listarNombres(), Adii.this);
                        lista.setAdapter(adapter0);
                        break;
                    case 1:
                        AdiiAdapter adapter1 = new AdiiAdapter(listarDias(), Adii.this);
                        lista.setAdapter(adapter1);
                        break;
                    case 2:
                        AdiiAdapter adapter2 = new AdiiAdapter(listarMeses(), Adii.this);
                        lista.setAdapter(adapter2);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }



    private ArrayList<AdiiListView> listar() {
        ArrayList<AdiiListView> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.spinner);
          //crea la lista

        for (int i = 0; i < titulos.length; i++){
            lista.add(new AdiiListView(titulos[i]));
        }
        return lista;
    }

    private ArrayList<AdiiListView> listarNombres() {
        ArrayList<AdiiListView> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.Nombres);
        //crea la lista

        for (int i = 0; i < titulos.length; i++){
            lista.add(new AdiiListView(titulos[i]));
        }
        return lista;
    }

    private ArrayList<AdiiListView> listarDias() {
        ArrayList<AdiiListView> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.Dias);
        //crea la lista

        for (int i = 0; i < titulos.length; i++){
            lista.add(new AdiiListView(titulos[i]));
        }
        return lista;
    }

    private ArrayList<AdiiListView> listarMeses() {
        ArrayList<AdiiListView> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.Meses);
        //crea la lista

        for (int i = 0; i < titulos.length; i++){
            lista.add(new AdiiListView(titulos[i]));
        }
        return lista;
    }

}


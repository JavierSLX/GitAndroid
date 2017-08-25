package com.example.morpheus.morpheus;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.morpheus.morpheus.adapterFabi.modeloAdapter;
import com.example.morpheus.morpheus.modeloFabi.modelo;

import java.util.ArrayList;

public class Fabi extends AppCompatActivity {
    private Spinner spinner ;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabi);

        spinner = (Spinner)findViewById(R.id.spinner);
        lista = (ListView)findViewById(R.id.lista);
        //crea el adapter
        modeloAdapter adapter =new modeloAdapter(listar(), this);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        modeloAdapter adapter0 = new modeloAdapter(listarNombres(),Fabi.this);
                        lista.setAdapter(adapter0);


                        break;
                    case 1:
                        modeloAdapter adapter1 = new modeloAdapter(listarDias(),Fabi.this);
                        lista.setAdapter(adapter1);


                        break;
                    case 2:
                        modeloAdapter adapter2 = new modeloAdapter(listarmeses(),Fabi.this);
                        lista.setAdapter(adapter2);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    private ArrayList<modelo> listar() {
        ArrayList<modelo> lista = new ArrayList<>();
        String[] opciones = getResources().getStringArray(R.array.opciones);

        //crea la lista

        for (int i = 0; i <opciones.length; i++){
            lista.add(new modelo(opciones[i]));
        }
        return lista;
    }

    private ArrayList<modelo> listarNombres() {
        ArrayList<modelo> lista = new ArrayList<>();
        String[] opciones = getResources().getStringArray(R.array.nombres);

        //crea la lista

        for (int i = 0; i <opciones.length; i++){
            lista.add(new modelo(opciones[i]));
        }
        return lista;
    }
    private ArrayList<modelo> listarmeses() {
        ArrayList<modelo> lista = new ArrayList<>();
        String[] opciones = getResources().getStringArray(R.array.meses);

        //crea la lista

        for (int i = 0; i <opciones.length; i++){
            lista.add(new modelo(opciones[i]));
        }
        return lista;
    }
    private ArrayList<modelo> listarDias() {
        ArrayList<modelo> lista = new ArrayList<>();
        String[] opciones = getResources().getStringArray(R.array.semana);

        //crea la lista

        for (int i = 0; i <opciones.length; i++){
            lista.add(new modelo(opciones[i]));
        }
        return lista;
    }


}

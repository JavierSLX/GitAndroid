package com.example.morpheus.morpheus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.morpheus.morpheus.adapterAngel.ItemAngelAdapter;
import com.example.morpheus.morpheus.adapterAngel.OpcionAngelAdapter;
import com.example.morpheus.morpheus.modeloAngel.ItemAngel;
import com.example.morpheus.morpheus.modeloAngel.OpcionAngel;

import java.util.ArrayList;

public class AngelActivity extends AppCompatActivity {
    //Declaracion de elementos
    private Spinner spinnerAngel;
    private ListView listviewAngel;
    private ArrayList<OpcionAngel> opcionesAngel;
    private ArrayList<ItemAngel>elementosAngel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel);
        //Se obtiene el array-string deseado
        String []titulos=getResources().getStringArray(R.array.opciones);
        //Se inicaliza el arraylist y se le agregan los item del arreglo
        opcionesAngel=new ArrayList<>();
        for(int i=0;i<titulos.length;i++)
        {
            opcionesAngel.add(new OpcionAngel(titulos[i]));
        }
        //Se crea un nuevo adapter de tipo OpcioAngelAdapter
        OpcionAngelAdapter adapter=new OpcionAngelAdapter(this,opcionesAngel);
        //Se instancia el spinner del xml con el elemento java y se carga el adapter
        spinnerAngel=(Spinner)findViewById(R.id.spinnerAngel);
        spinnerAngel.setAdapter(adapter);

        //Metodo que se ejecuta cuando se selecciona un elemento del spinner
        spinnerAngel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            //Metodo que devuelve el item seleccionado
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    //Opcion seleccionada dias
                    case 0:
                        String []titulos=getResources().getStringArray(R.array.nombres);
                        mostrarElementos(titulos);
                        break;
                    //Opcion seleccionada meses
                    case 1:
                        titulos=getResources().getStringArray(R.array.semana);
                        mostrarElementos(titulos);
                        break;
                    //Opcion seleccionada equipo
                    case 2:
                        titulos=getResources().getStringArray(R.array.meses);
                        mostrarElementos(titulos);
                        break;
                }

            }
            //Metodo que se ejecuta cuando no hay elementos seleccionados
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                String []titulos=getResources().getStringArray(R.array.semana);
                mostrarElementos(titulos);
            }
        });
    }
    //Metodo que crea el nuevo arraylist y agrega sus elementos, creo el nuevo adapter de tipo ItemAngelAdapter  lo carga en el
    //listview
    public void mostrarElementos(String []titulosListView)
    {
        elementosAngel=new ArrayList<>();
        for(int j=0;j<titulosListView.length;j++)
        {
            elementosAngel.add(new ItemAngel(titulosListView[j]));
        }
        ItemAngelAdapter itemAdapter2=new ItemAngelAdapter(AngelActivity.this,elementosAngel);
        listviewAngel=(ListView)findViewById(R.id.listaAngel);
        listviewAngel.setAdapter(itemAdapter2);
    }


}

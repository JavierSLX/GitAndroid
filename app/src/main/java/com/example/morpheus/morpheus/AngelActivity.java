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
    private Spinner spinnerAngel;
    private ListView listviewAngel;
    private ArrayList<OpcionAngel> opcionesAngel;
    private ArrayList<ItemAngel>elementosAngel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel);
        String []titulos=getResources().getStringArray(R.array.opcionesAngel);
        opcionesAngel=new ArrayList<>();
        for(int i=0;i<titulos.length;i++)
        {
            opcionesAngel.add(new OpcionAngel(titulos[i]));
        }
        OpcionAngelAdapter adapter=new OpcionAngelAdapter(this,opcionesAngel);
        spinnerAngel=(Spinner)findViewById(R.id.spinnerAngel);
        spinnerAngel.setAdapter(adapter);

        //
        spinnerAngel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        String []titulosListView1=getResources().getStringArray(R.array.diasAngel);
                        elementosAngel=new ArrayList<>();
                        for(int j=0;j<titulosListView1.length;j++)
                        {
                            elementosAngel.add(new ItemAngel(titulosListView1[j]));
                        }
                        ItemAngelAdapter itemAdapter=new ItemAngelAdapter(AngelActivity.this,elementosAngel);
                        listviewAngel=(ListView)findViewById(R.id.listaAngel);
                        listviewAngel.setAdapter(itemAdapter);
                        break;
                    case 1:
                        String []titulosListView2=getResources().getStringArray(R.array.mesesAngel);
                        elementosAngel=new ArrayList<>();
                        for(int j=0;j<titulosListView2.length;j++)
                        {
                            elementosAngel.add(new ItemAngel(titulosListView2[j]));
                        }
                        ItemAngelAdapter itemAdapter2=new ItemAngelAdapter(AngelActivity.this,elementosAngel);
                        listviewAngel=(ListView)findViewById(R.id.listaAngel);
                        listviewAngel.setAdapter(itemAdapter2);
                        break;
                    case 2:
                        String []titulosListView3=getResources().getStringArray(R.array.equipoAngel);
                        elementosAngel=new ArrayList<>();
                        for(int j=0;j<titulosListView3.length;j++)
                        {
                            elementosAngel.add(new ItemAngel(titulosListView3[j]));
                        }
                        ItemAngelAdapter itemAdapter3=new ItemAngelAdapter(AngelActivity.this,elementosAngel);
                        listviewAngel=(ListView)findViewById(R.id.listaAngel);
                        listviewAngel.setAdapter(itemAdapter3);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                String []titulosListView2=getResources().getStringArray(R.array.diasAngel);
                elementosAngel=new ArrayList<>();
                for(int j=0;j<titulosListView2.length;j++)
                {
                    elementosAngel.add(new ItemAngel(titulosListView2[j]));
                }
                ItemAngelAdapter itemAdapter2=new ItemAngelAdapter(AngelActivity.this,elementosAngel);
                listviewAngel=(ListView)findViewById(R.id.listaAngel);
                listviewAngel.setAdapter(itemAdapter2);
            }
        });
    }

}

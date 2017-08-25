package com.example.morpheus.morpheus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button javier;
	private Button btnFabi;
    Button adi;
    Button angelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relaciona cada view con su object
        javier = (Button)findViewById(R.id.javier);

        //Crea el evento del botón
        javier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity = new Intent(MainActivity.this, ListaActivity.class);
                startActivity(activity);
            }
        });
		
        btnFabi = (Button)findViewById(R.id.Fabi);

        btnFabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Fabi.class);
                startActivity(intent);
            }
        });

        adi = (Button) findViewById(R.id.adi);

       // Evento del boton adi
        adi.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, Adii.class);
            startActivity(intent);
            }
        });

        angelBtn=(Button)findViewById(R.id.angelBtn);
        angelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AngelActivity.class);
                startActivity(intent);
            }
        });
    }
}

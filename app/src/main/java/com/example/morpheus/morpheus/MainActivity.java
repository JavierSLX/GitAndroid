package com.example.morpheus.morpheus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button adi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adi = (Button) findViewById(R.id.adi);

       // Evento del boton adi
        adi.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this, Adii.class);
            startActivity(intent);
            }
        });
    }
}

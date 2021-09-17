package com.example.parcial_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button varregis;
    private TextView varlista;
    private String hitch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varlista = findViewById(R.id.lista);
        varregis = findViewById(R.id.boton1);
        hitch ="";


        varregis.setOnClickListener((view)->{

            Intent configinten = new Intent(this,regis.class);
           startActivity(configinten);
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

       String taxto = getIntent().getStringExtra("taxto");
        hitch += taxto +"\n";
        varlista.setText(hitch);

    }



}
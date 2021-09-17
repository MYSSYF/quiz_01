package com.example.parcial_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class caja2 extends AppCompatActivity {

    private CheckBox varcajaAE1;
    private CheckBox varcajaAE2;
    private CheckBox varcajaAE3;
    private Button varfinale;
    private String punt2;
    private int papa;
    private String paper;
    private String taxto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja2);

        varcajaAE1 = findViewById(R.id.AE1);
        varcajaAE2 = findViewById(R.id.AE2);
        varcajaAE3 = findViewById(R.id.AE3);
        varfinale = findViewById(R.id.boton4);

        String name = getIntent().getExtras().getString("name");
        String punt1 = getIntent().getExtras().getString("punt1");



        varfinale.setOnClickListener((view)->{
            if(varcajaAE1.isChecked()||varcajaAE2.isChecked()||varcajaAE3.isChecked()) {

                calPunt();
                mate(punt1,punt2);
                frase(name,paper);

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                intent.putExtra("taxto",taxto);

                startActivity(intent);

            }else{
                Toast.makeText(this, "Seleccione almenos una", Toast.LENGTH_SHORT).show();
            }



        });
    }

    public void frase(String name,String paper){
        taxto = name+" -> "+paper;
    }

    public void mate(String par1,String par2){
        int part1 = (int) Integer.parseInt(par1);
        int part2 = (int) Integer.parseInt(par2);
        papa = part1+part2;
        paper = papa+"";

    }

    public void calPunt(){
        if(varcajaAE1.isChecked()){
            punt2 = "3";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAE2.isChecked()){
            punt2 = "3";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if (varcajaAE3.isChecked()){
            punt2 = "0";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAE1.isChecked()&&varcajaAE2.isChecked()){
            punt2 = "6";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAE2.isChecked()&&varcajaAE3.isChecked()){
            punt2 = "3";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAE1.isChecked()&&varcajaAE3.isChecked()){
            punt2 = "3";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAE1.isChecked()&&varcajaAE2.isChecked()&&varcajaAE3.isChecked()){
            punt2 = "6";
            //Toast.makeText(this, punt2, Toast.LENGTH_SHORT).show();
        }

    }
}
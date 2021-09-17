package com.example.parcial_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class caja1 extends AppCompatActivity {

    private CheckBox varcajaAP1;
    private CheckBox varcajaAP2;
    private CheckBox varcajaAP3;
    private Button varcontinue2;
    private String punt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja1);

        varcajaAP1 = findViewById(R.id.AP1);
        varcajaAP2 = findViewById(R.id.AP2);
        varcajaAP3 = findViewById(R.id.AP3);
        varcontinue2 = findViewById(R.id.boton3);

        String name = getIntent().getExtras().getString("name");
        String code = getIntent().getExtras().getString("code");

        varcontinue2.setOnClickListener((view)->{



if(varcajaAP1.isChecked()||varcajaAP2.isChecked()||varcajaAP3.isChecked()) {

    calPunt();

    Intent configinten = new Intent(this, caja2.class);

    configinten.putExtra("name",name);
    configinten.putExtra("punt1",punt1);

    startActivity(configinten);

}else{
    Toast.makeText(this, "Seleccione almenos una", Toast.LENGTH_SHORT).show();
}
        });
    }

    public void calPunt(){
        if(varcajaAP1.isChecked()){
            punt1 = "1";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAP2.isChecked()){
            punt1 = "3";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if (varcajaAP3.isChecked()){
           punt1 = "0";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAP1.isChecked()&&varcajaAP2.isChecked()){
            punt1 = "4";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAP2.isChecked()&&varcajaAP3.isChecked()){
            punt1 = "3";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAP1.isChecked()&&varcajaAP3.isChecked()){
            punt1 = "1";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
        if(varcajaAP1.isChecked()&&varcajaAP2.isChecked()&&varcajaAP3.isChecked()){
            punt1 = "4";
            //Toast.makeText(this, punt1, Toast.LENGTH_SHORT).show();
        }
    }
}
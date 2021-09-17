package com.example.parcial_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class regis extends AppCompatActivity {

    private EditText varname;
    private EditText varcodigo;
    private Button varconinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        varname = findViewById(R.id.nombre);
        varcodigo = findViewById(R.id.codigo);
        varconinue = findViewById(R.id.boton2);



        varconinue.setOnClickListener((view)->{

            Intent configinten = new Intent(this,caja1.class);

            String name = varname.getText().toString();
            String code = varcodigo.getText().toString();

            configinten.putExtra("name",name);

            SharedPreferences hhh = getSharedPreferences("code",MODE_PRIVATE);
            hhh.edit().putString("code",code);

            if(code==code+"0") {
                Toast.makeText(this, "no se repiten codigos", Toast.LENGTH_SHORT).show();
            }else{
                startActivity(configinten);
            }
        });
    }
}
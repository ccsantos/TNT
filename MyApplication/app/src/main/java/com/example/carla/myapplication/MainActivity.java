package com.example.carla.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private Button btnAceptar;
    private EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        txtNombre = (EditText)findViewById(R.id.txtNombre);

        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                //Intent para pasar datos de una pantallita a la otra
                Intent intent = new Intent(MainActivity.this, Saludo.class);
                Bundle bundle = new Bundle();
                bundle.putString("Nombre",txtNombre.getText().toString() );
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });
    }



}

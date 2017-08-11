package com.example.carla.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        Bundle bundle= this.getIntent().getExtras();
        txtSaludo.setText("Haciendo de cero,"+ bundle.getString("Nombre")+"  aprendo " );

    }

}

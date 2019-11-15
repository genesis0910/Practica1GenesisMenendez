package com.facci.genesismendoza.practica1genesismenendez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, guardar, buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --------------------------------------------------------------------------
        login = (Button) findViewById(R.id.button_login);
        guardar = (Button) findViewById(R.id.button_guardar);
        buscar = (Button) findViewById(R.id.button_buscar);

        // Eventos onclick ---------------------------------------------------------
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AgregarActivity.class);
                startActivity(intent);
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });

    }
}

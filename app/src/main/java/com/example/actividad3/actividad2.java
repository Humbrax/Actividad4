package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class actividad2 extends AppCompatActivity {

    private TextView datos;
    private String valorRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        datos = findViewById(R.id.textView);
        Bundle variablesRecibidas = getIntent().getExtras();
        if (variablesRecibidas != null) {
            valorRecibido = variablesRecibidas.getString("valorKey");
            String mensaje = "Bienvenido, " + valorRecibido;
            datos.setText(mensaje);
            Toast.makeText(getApplicationContext(), "Usted ha ingresado al sistema de datos", Toast.LENGTH_SHORT).show();
        }
    }
}
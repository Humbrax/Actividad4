package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.edtusuario);
        password = findViewById(R.id.edtpassword);
    }

    public void enviarDatos(View view) {
        String valor = usuario.getText().toString();
        Bundle variables = new Bundle();
        variables.putString("valorKey", valor);
        Intent actividad2 = new Intent(this, actividad2.class); //
        actividad2.putExtras(variables);
        startActivity(actividad2);
    }
}
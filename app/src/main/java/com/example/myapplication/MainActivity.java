package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button mostrar;
    EditText insertar1, insertar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.Mostrar);
        mostrar = findViewById(R.id.Enviar);
        insertar1 = findViewById(R.id.Insertar1);
        insertar2 = findViewById(R.id.Insertar2);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombres = insertar1.getText().toString();
                String apellidos = insertar2.getText().toString();
                String usuario = nombres + apellidos;
                textView.setText("Su Nombre Es: \n" + nombres + "\n\n Su Apellido Es: \n" + apellidos);
            }
        });


    }
}
package com.example.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){
        //Creamos el Intent

        Intent intent = new Intent(MainActivity.this, recepciondatos.class);
        EditText txtNumeroID = (EditText)findViewById(R.id.txtnemeroID);
        EditText txtNombre = (EditText)findViewById(R.id.txtnombre);
        EditText txtFechaNacimiento = (EditText) findViewById(R.id.etdfechaNac);
        EditText txtCiudad = (EditText)findViewById(R.id.txtciudad);

        RadioButton radiobuton = (RadioButton) findViewById(R.id.rbtmas);
        RadioButton radiobuton2 = (RadioButton) findViewById(R.id.rbtfem);

        EditText txtCorreo = (EditText)findViewById(R.id.txtcorreo);
        EditText txtTelefono = (EditText)findViewById(R.id.txttelefono);

        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();

        if(radiobuton.isChecked()==true){
            String resultado = "Masculino";
            b.putString("genero", resultado);
        }else if(radiobuton2.isChecked()==true){
            String resultado = "Femenino";
            b.putString("genero", resultado);
        }

        b.putString("NumeroID", txtNumeroID.getText().toString());
        b.putString("Nombre", txtNombre.getText().toString());
        b.putString("Fechanacimiento", txtFechaNacimiento.getText().toString());
        b.putString("Ciudad", txtCiudad.getText().toString());
        b.putString("Correo", txtCorreo.getText().toString());
         b.putString("Telefono", txtTelefono.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);

        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}
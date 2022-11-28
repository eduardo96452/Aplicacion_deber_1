package com.example.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class recepciondatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepciondatos);

        //Localizar los controles
        TextView txtnumeroID = (TextView)findViewById(R.id.recepcionnumeroid);
        TextView txtnombre = (TextView)findViewById(R.id.recepcionnombre);
        TextView txtfechanacimiento = (TextView)findViewById(R.id.recepcionfechanac);
        TextView txtciudad = (TextView)findViewById(R.id.recepcionciudad);
        TextView txtgenero = (TextView)findViewById(R.id.recepciongenero);
        TextView txtcorreo = (TextView)findViewById(R.id.recepcioncorreo);
        TextView txttelefono = (TextView)findViewById(R.id.recepciontelefono);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtnumeroID.setText(bundle.getString("NumeroID"));
        txtnombre.setText(bundle.getString("Nombre"));
        txtfechanacimiento.setText(bundle.getString("Fechanacimiento"));
        txtciudad.setText(bundle.getString("Ciudad"));
        txtgenero.setText(bundle.getString("genero"));
        txtcorreo.setText(bundle.getString("Correo"));
        txttelefono.setText(bundle.getString("Telefono"));
    }

    public void btEnviar(View view){
        Intent intent = new Intent(this, recepciondatos.class);
        startActivity(intent);
    }
}






















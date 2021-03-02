package com.example.appcombustivelframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularOpcao(View view){

        EditText txtAlcool = findViewById(R.id.txtAlcool);
        EditText txtGasolina = findViewById(R.id.txtGasolina);

        String strAlcool = txtAlcool.getText().toString();
        String strGasolina = txtGasolina.getText().toString();

        double alcool = Double.parseDouble(strAlcool);
        double gasolina = Double.parseDouble(strGasolina);

        double resultado = alcool / gasolina;

        if(resultado > 0.7){
            Toast.makeText(this, "Gasolina!", Toast.LENGTH_SHORT).show();
        }
        else if(resultado < 0.7){
            Toast.makeText(this, "Álcool!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Tanto faz!", Toast.LENGTH_SHORT).show();
        }
    }

}

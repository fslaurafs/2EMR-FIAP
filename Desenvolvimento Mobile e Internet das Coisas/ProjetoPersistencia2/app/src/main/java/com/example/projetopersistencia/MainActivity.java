package com.example.projetopersistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.sh = getSharedPreferences("lista",MODE_PRIVATE);


        Button btGravar  = findViewById(R.id.btGravar);
        Button btRecuperar = findViewById(R.id.btRecuperar);

        btGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //gravando mensagem na área de persistencia
                EditText txtMensagem = findViewById(R.id.txtMensagem);
                String mensagem = txtMensagem.getText().toString();

                MainActivity.this.sh.edit().putString("msg",mensagem).apply();
                Toast.makeText(MainActivity.this, "Gravado!", Toast.LENGTH_SHORT).show();

            }
        });

        btRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensagem = MainActivity.this.sh.getString("msg","default");
                Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,MensagemActivity.class);
                startActivity(intent);
                

            }
        });




    }
}

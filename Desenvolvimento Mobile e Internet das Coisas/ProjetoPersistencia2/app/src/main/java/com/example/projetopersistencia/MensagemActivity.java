package com.example.projetopersistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        TextView lbMensagem = findViewById(R.id.lbMensagem);
        SharedPreferences sh = getSharedPreferences("lista",MODE_PRIVATE);

        lbMensagem.setText(sh.getString("msg","default"));

    }
}

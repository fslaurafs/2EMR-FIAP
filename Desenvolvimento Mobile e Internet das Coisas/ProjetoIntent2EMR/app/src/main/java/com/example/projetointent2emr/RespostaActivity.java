package com.example.projetointent2emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);


        Intent intent = getIntent();
        String msg = intent.getStringExtra("mensagem");

        TextView lbResposta = findViewById(R.id.lbMensagem);
        lbResposta.setText(msg);


    }
}

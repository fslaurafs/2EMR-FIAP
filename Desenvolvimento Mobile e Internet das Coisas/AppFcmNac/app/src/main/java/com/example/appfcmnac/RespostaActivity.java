package com.example.appfcmnac;

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

        TextView txtResposta = findViewById(R.id.txtResposta);
        txtResposta.setText(intent.getStringExtra("fcm"));
    }
}

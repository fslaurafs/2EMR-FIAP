package com.example.projetointent2emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviaMensagem(View v){

        //recebendo o texto do EditText
        EditText txtMensagem = findViewById(R.id.txtMensagem);
        String msg = txtMensagem.getText().toString();

        //Transitar de uma tela para a outra
        Intent intent = new Intent(this,RespostaActivity.class);
        intent.putExtra("mensagem",msg);
        startActivity(intent);
    }

}

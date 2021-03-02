package com.example.gmcalixto.Ex1_AppPesquisaHttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gmcalixto.Ex1_AppPesquisaHttp.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBar off
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION + View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOpcoes);
        Objects.requireNonNull(getSupportActionBar()).hide();

    }

    public void executaConsulta(View view) {

        String response;
        String url = "https://jsonplaceholder.typicode.com/todos/";

        EditText txtConsulta = findViewById(R.id.editTextPesquisa);
        url += txtConsulta.getText().toString();

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtCompleted = findViewById(R.id.txtCompleted);
        TextView txtMensagem = findViewById(R.id.viewMensagem);

        new DataGet(txtTitle,txtCompleted,txtMensagem).execute(url);

    }

    /*public void executaPost(View view) {

        String url = "https://reqres.in/api/users/";
        String parameter =  "{\n" +
                "    \"name\": \"testando\",\n" +
                "    \"job\": \"1234\"\n" +
                "}";
        TextView txtMensagem = findViewById(R.id.viewMensagem);

       new DataPost(txtMensagem).execute(url,parameter);

    }*/

}

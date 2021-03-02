package com.example.appfcmnac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void onCalcular(View view) {
        // recebendo a idade:
        EditText txtIdade = findViewById(R.id.txtIdade);
        String strIdade = txtIdade.getText().toString();
        int idade = Integer.parseInt(strIdade);

        // calculo da FCM
        int fcm = 220 - idade;

        // FCM referente as modalidades
        // caminhada rapida (55% a 60%):
        int caminhadaRapida1 = (fcm * 55)/100;
        int caminhadaRapida2 = (fcm * 60)/ 100;
        // trote (65% a 70%):
        int Trote1 = (fcm * 65)/100;
        int Trote2 = (fcm * 70)/100;
        // coriida leve (75% a 80%):
        int corridaLeve1 = (fcm * 75)/100;
        int corridaLeve2 = (fcm * 80)/100;
        // corrida moderada (85% a 90%):
        int corridaModerada1 = (fcm * 85)/100;
        int corridaModerada2 = (fcm * 90)/100;
        // corrida intensa (acima de 95%):
        int corridaIntensa = (fcm * 95)/100;

        // intent:
        Intent intent = new Intent(this, RespostaActivity.class);
        intent.putExtra("fcm", "Sua frequência cardíaca máxima (FCM) é de " + fcm + " bpm." +
                "\n\nFCM nas modalidades esportivas:" +
                "\nCAMINHADA RÁPIDA: \nde " + caminhadaRapida1 + " bpm a " + caminhadaRapida2 + " bpm;" +
                "\n\nTROTE: \nde " + Trote1 + " bpm a " + Trote2 + " bpm;" +
                "\n\nCORRIDA LEVE: \nde " + corridaLeve1 + " bpm a " + corridaLeve2 + " bpm;" +
                "\n\nCORRIDA MODERADA: \nde " + corridaModerada1 + " bpm a " + corridaModerada2 + " bpm;" +
                "\n\nCORRIDA INTENSA: \nacima de " + corridaIntensa + " bpm.");
        startActivity(intent);

    }

}

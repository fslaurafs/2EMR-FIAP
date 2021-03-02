package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAmericanas(View view){
        //intent:
        findViewById(R.id.btAmericanas);
        Intent americanasIntent = new Intent(this, AmericanasActivity.class);
        startActivity(americanasIntent);
    }

    public void onEbay(View view){
        //intent:
        findViewById(R.id.btEbay);
        Intent ebayIntent = new Intent(this, EbayActivity.class);
        startActivity(ebayIntent);
    }

    public void onMercadoLivre(View view){
        //intent:
        findViewById(R.id.btMercadoLivre);
        Intent mercadoLivreIntent = new Intent(this, MercadoLivreActivity.class);
        startActivity(mercadoLivreIntent);
    }

    public void onNetshoes(View view){
        //intent:
        findViewById(R.id.btNetshoes);
        Intent netshoesIntent = new Intent(this, NetshoesActivity.class);
        startActivity(netshoesIntent);
    }

    public void onSubmarino(View view){
        //intent:
        findViewById(R.id.btSubmarino);
        Intent submarinoIntent = new Intent(this, SubmarinoActivity.class);
        startActivity(submarinoIntent);
    }

    public void onWebmotors(View view){
        //intent:
        findViewById(R.id.btWebmotors);
        Intent webmotorsIntent = new Intent(this, WebmotorsActivity.class);
        startActivity(webmotorsIntent);
    }

    public void onSobre(View view){
        //intent:
        findViewById(R.id.btSobre);
        Intent sobreIntent = new Intent(this, SobreActivity.class);
        startActivity(sobreIntent);
    }
}

package com.example.exemploscroll;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chamando a instância do Scrollview
        ScrollView scrollView = findViewById(R.id.scrollTeste);

        //invocando uma LinearLayout manualmente
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        //configurando o layout do LinearLayout
        LinearLayout.LayoutParams lpll = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lpll);

        //adicionando LinearLayout no ScrollView
        scrollView.addView(ll);

        //criar dinamicamente objetos na Scrollview
        for (int i = 0; i < 50; i++) {
            TextView tv = new TextView(this);
            tv.setText("Teste de Scroll " + Integer.toString(i));
            tv.setTextSize(1 + i);
            ll.addView(tv);
        }
    }
}

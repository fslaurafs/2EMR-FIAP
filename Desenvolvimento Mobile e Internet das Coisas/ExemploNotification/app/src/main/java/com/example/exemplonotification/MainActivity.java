package com.example.exemplonotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btNotificar = findViewById(R.id.btNotificar);

        btNotificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtTítulo = findViewById(R.id.txtTitulo);
                EditText txtConteudo = findViewById(R.id.txtConteudo);

                // criação da da mensagem a ser renderizada usando o NotificationCompat.Builder
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "appnotification")
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle(txtTítulo.getText().toString())
                        .setContentText(txtConteudo.getText().toString())
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .setDefaults(Notification.DEFAULT_ALL);

                // geração do canal de envio de notificações
                CharSequence nome = "MeuCanal";
                String descricao = "CanalTeste";
                int importancia = NotificationManager.IMPORTANCE_HIGH;

                NotificationChannel channel = new NotificationChannel("appnotification", nome, importancia);
                channel.setDescription(descricao);

                // vincular builder e canal ao NotificationManager
                NotificationManager notificationManager = getSystemService(NotificationManager.class);
                notificationManager.createNotificationChannel(channel);

                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(MainActivity.this); // própria activity
                notificationManagerCompat.notify(1, builder.build());

            }
        });
    }
}
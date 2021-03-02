package com.example.ex2_appbloconotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private String fileName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBar
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION + View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOpcoes);
        getSupportActionBar().hide();

        //gravação do arquivos
        this.fileName = getApplicationContext().getFilesDir().getPath() + "/";

        //objetos
        final EditText contentBox = findViewById(R.id.contextBox);
        final EditText fileNameToOpen = findViewById(R.id.txtNomeArquivo);
        final Button btLimpar = findViewById(R.id.btLimpar);
        final Button btSalvar = findViewById(R.id.btSalvar);
        final Button btRecuperar = findViewById(R.id.btRecuperar);

        //listeners
        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contentBox.setText("");
                fileNameToOpen.setText("");
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fileNameToOpen.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Insira o nome de arquivo", Toast.LENGTH_SHORT).show();
                }
                else{
                    String completeFN  = fileName + fileNameToOpen.getText().toString();
                    String content = contentBox.getText().toString();
                    MainActivity.this.gravaDadosArquivo(completeFN,content);
                }
            }
        });

        btRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fileNameToOpen.getText().length() == 0){
                    Toast.makeText(MainActivity.this,"Insira o nome de arquivo", Toast.LENGTH_SHORT).show();
                }
                else{
                    String completeFN  = fileName + fileNameToOpen.getText().toString();
                    String content = recuperaDadosArquivo(completeFN);
                    contentBox.setText(content);
                }
            }
        });
    }

    public void gravaDadosArquivo(String fileName,String data){
        try{
            OutputStreamWriter bufferSaida = new OutputStreamWriter(new FileOutputStream(fileName),"UTF-8");
            bufferSaida.write(data);
            bufferSaida.close();
            Toast.makeText(this, "Arquivo salvo", Toast.LENGTH_SHORT).show();
        }
        catch(FileNotFoundException e){
            Toast.makeText(this, "Falha na abertura do arquivo", Toast.LENGTH_SHORT).show();
        }
        catch (UnsupportedEncodingException e){
            Toast.makeText(this, "Falha na codificação", Toast.LENGTH_SHORT).show();
        }
        catch (IOException e){
            Toast.makeText(this, "Falha na escrita", Toast.LENGTH_SHORT).show();
        }
    }

    public String recuperaDadosArquivo(String fileName){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-8"));
            StringBuilder sb = new StringBuilder();
            String linha = bufferedReader.readLine();

            while(linha != null){
                sb.append(linha);
                sb.append("\n");
                linha = bufferedReader.readLine();
            }

            Toast.makeText(this, "Arquivo recuperado", Toast.LENGTH_SHORT).show();
            return sb.toString();
        }
        catch(FileNotFoundException e){
            Toast.makeText(this, "Falha na abertura do arquivo", Toast.LENGTH_SHORT).show();
        }
        catch (UnsupportedEncodingException e){
            Toast.makeText(this, "Falha na codificação", Toast.LENGTH_SHORT).show();
        }
        catch (IOException e){
            Toast.makeText(this, "Falha na leitura", Toast.LENGTH_SHORT).show();
        }
        return "";
    }

}

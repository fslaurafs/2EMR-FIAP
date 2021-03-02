package com.example.gmcalixto.Ex1_AppPesquisaHttp;

import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class DataGet extends AsyncTask<String,Void,String> {

    private TextView txtTitle;
    private TextView txtCompleted;
    private TextView txtMensagem;

    public DataGet(TextView txtTitle, TextView txtCompleted, TextView txtMensagem) {
        this.txtTitle = txtTitle;
        this.txtCompleted = txtCompleted;
        this.txtMensagem = txtMensagem;

        txtMensagem.setText("Pesquisando...");
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... strings) {

        String url = strings[0];
        String result = NetworkToolkit.doGet(url);

        return result;
    }

    @Override
    protected void onPostExecute(String s) {

        txtMensagem.setText("Encontrado!");

        try {
            JSONObject jsonResponse = new JSONObject(s);

            String title = jsonResponse.getString("title");
            String completed = jsonResponse.getString("completed");

            txtTitle.setText(title);
            txtCompleted.setText(completed);

        } catch(JSONException e) {
            this.txtTitle.setText("erroJSON");
        }
    }
}


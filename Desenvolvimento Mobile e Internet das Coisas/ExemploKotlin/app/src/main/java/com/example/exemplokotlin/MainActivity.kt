package com.example.exemplokotlin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btMostrar.setOnClickListener { v: View? ->

            var texto = txtMensagem.text.toString()
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show()
        }

    }
}

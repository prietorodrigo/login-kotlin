package com.example.loginkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityBoasVindas : AppCompatActivity() {

    private lateinit var textMensagem: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boas_vindas)

        textMensagem = findViewById<TextView>(R.id.txtMensagem)
        val params = intent.extras
        val s = intent.extras!!.getString("usr")
        val mensagem = "Bem vindo, $s"
        textMensagem.setText(mensagem)
    }
}
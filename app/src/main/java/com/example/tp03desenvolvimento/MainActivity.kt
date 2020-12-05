package com.example.tp03desenvolvimento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonIniciar.setOnClickListener{
            if(editTextNomeCompleto.text.isNullOrEmpty()){
                Toast.makeText(this,"Digite seu nome!", Toast.LENGTH_LONG).show()
            }else {
                var usuario = Usuario()
                usuario.nome = editTextNomeCompleto.text.toString()
                var intent = Intent(
                        this,
                        Perguntas::class.java
                )
                intent.putExtra("nomeDoUsuario", usuario)
                startActivity(intent)
            }
        }
    }
}
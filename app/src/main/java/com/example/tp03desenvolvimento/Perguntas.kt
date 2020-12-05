package com.example.tp03desenvolvimento

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_perguntas.*
import kotlinx.android.synthetic.main.fragment_pergunta9.*

class Perguntas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)
    }

    override fun onPause() {
        super.onPause()
        lateinit var pergunta1ViewModel: Pergunta1ViewModel
        pergunta1ViewModel = ViewModelProvider(this, ViewModelFactory()).get(Pergunta1ViewModel::class.java)
        var usuario = intent.getSerializableExtra("nomeDoUsuario") as Usuario
        var resultado:Int = pergunta1ViewModel.pontos
        usuario.pontuacao = resultado
        var novoUsuario = Usuario(usuario.nome, resultado)
        intent = Intent(
                this,
                Resultado::class.java
        )
        intent.putExtra("usuarioResultado", novoUsuario)
        startActivity(intent)
    }
}
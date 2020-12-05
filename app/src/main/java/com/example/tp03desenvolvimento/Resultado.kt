package com.example.tp03desenvolvimento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        var usuario = intent.getSerializableExtra("usuarioResultado") as Usuario
        var nome = usuario.nome
        var pontuacao = usuario.pontuacao
        lateinit var classificacao:String
        labelNomeResultado.text = nome
        if(pontuacao<13){
            classificacao = "Conservador"
        }else if(pontuacao <14 && pontuacao <30){
            classificacao = "Moderado"
        }else if(pontuacao >29){
            classificacao = "Arrojado"
        }
        labelResultado.text = classificacao
    }
}
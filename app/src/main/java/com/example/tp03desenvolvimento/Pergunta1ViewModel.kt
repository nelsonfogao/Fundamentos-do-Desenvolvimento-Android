package com.example.tp03desenvolvimento

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class Pergunta1ViewModel : ViewModel(){
    var pontos:Int = 0

    fun soma0(){
        pontos += 0
    }
    fun soma1(){
        pontos += 1
    }
    fun soma2(){
        pontos += 2
    }
    fun soma3(){
        pontos += 3
    }
    fun soma4(){
        pontos += 4
    }
    fun soma5(){
        pontos += 5
    }
}
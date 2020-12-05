package com.example.tp03desenvolvimento

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pergunta9.*

class Pergunta9 : Fragment() {
    private lateinit var pergunta1ViewModel: Pergunta1ViewModel
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_pergunta9, container, false)
        pergunta1ViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(Pergunta1ViewModel::class.java)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonP9.setOnClickListener {
            if(radioGroupP9.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_LONG).show()
            }else{
                when(radioGroupP9){
                    radioButtonP9A -> pergunta1ViewModel.soma0()
                    radioButtonP9B -> pergunta1ViewModel.soma1()
                    radioButtonP9C -> pergunta1ViewModel.soma2()
                    radioButtonP9D -> pergunta1ViewModel.soma4()
                    radioButtonP9E -> pergunta1ViewModel.soma5()
                }
                findNavController().navigate(R.id.action_pergunta9_to_resultado)
            }
        }
    }
}
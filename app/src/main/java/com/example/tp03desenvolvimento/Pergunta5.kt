package com.example.tp03desenvolvimento

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pergunta1.*
import kotlinx.android.synthetic.main.fragment_pergunta2.*
import kotlinx.android.synthetic.main.fragment_pergunta5.*

class Pergunta5 : Fragment() {
    private lateinit var pergunta1ViewModel: Pergunta1ViewModel
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_pergunta5, container, false)
        pergunta1ViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(Pergunta1ViewModel::class.java)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonP5.setOnClickListener {
            if(radioGroupP5.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_LONG).show()
            }else{
                when(radioGroupP5){
                    radioButtonP5A -> pergunta1ViewModel.soma0()
                    radioButtonP5B -> pergunta1ViewModel.soma2()
                    radioButtonP5C -> pergunta1ViewModel.soma4()
                }
                findNavController().navigate(R.id.pergunta6)
            }
        }
    }
}
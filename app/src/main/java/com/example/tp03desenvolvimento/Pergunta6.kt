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
import kotlinx.android.synthetic.main.fragment_pergunta6.*

class Pergunta6 : Fragment() {
    private lateinit var pergunta1ViewModel: Pergunta1ViewModel
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_pergunta6, container, false)
        pergunta1ViewModel = ViewModelProvider(requireActivity(), ViewModelFactory()).get(Pergunta1ViewModel::class.java)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonP6.setOnClickListener {
            if(radioGroupP6.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_LONG).show()
            }else{
                when(radioGroupP6){
                    radioButtonP6A -> pergunta1ViewModel.soma0()
                    radioButtonP6B -> pergunta1ViewModel.soma2()
                    radioButtonP6C -> pergunta1ViewModel.soma3()
                    radioButtonP6D -> pergunta1ViewModel.soma4()
                }
                findNavController().navigate(R.id.pergunta7)
            }
        }
    }
}
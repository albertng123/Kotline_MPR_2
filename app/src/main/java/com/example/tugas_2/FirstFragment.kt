package com.example.tugas_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlin.random.Random

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var A =  Random.nextInt(0,100)
        var B =  Random.nextInt(0,100)
        var C =  Random.nextInt(0,100)
        var D =  Random.nextInt(0,100)
        print(A)
        print(B)
        print(C)
        print(D)
        var stringE = "${A} + ${B}"
        var stringF = "${C} - ${D}"
        button_second.setText(stringE).toString()
        button_first.setText(stringF).toString()
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            var E = A+B
            var F = C-D
            if(E < F){
                Toast.makeText(context,"Benar",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context,"Salah",Toast.LENGTH_SHORT).show()
            }
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            var E = A+B
            var F = C-D
            if(E > F){
                Toast.makeText(context,"Benar",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context,"Salah",Toast.LENGTH_SHORT).show()
            }
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
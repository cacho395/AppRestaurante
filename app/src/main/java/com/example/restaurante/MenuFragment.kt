package com.example.restaurante

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.fragment.app.Fragment

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val menufrag: View = inflater.inflate(R.layout.fragment_menu, container, false)
        val button1: Button = menufrag.findViewById(R.id.btnbreak)

        button1.setOnClickListener(View.OnClickListener {
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, ItemFragment::class.java, null, "item")
                ?.addToBackStack("")
                ?.commit()

        })

        return menufrag
    }

    }



    /*fun onBreak(btnBreak: View){
        activity?.supportFragmentManager?.beginTransaction()
            ?.setReorderingAllowed(true)
            ?.replace(R.id.fragment_container_view, MenuFragment::class.java, null, "item")
            ?.addToBackStack("")
            ?.commit()
    }

    fun onLunch(btnlunch: View){
        Toast.makeText(this, (R.string.inconst), Toast.LENGTH_SHORT).show()
    }
    fun onDinner(btndinner: View){
        Toast.makeText(this, (R.string.inconst), Toast.LENGTH_SHORT).show()
    }
    fun onSnacks(btnsnacks: View){
        Toast.makeText(this, (R.string.inconst), Toast.LENGTH_SHORT).show()
    }*/

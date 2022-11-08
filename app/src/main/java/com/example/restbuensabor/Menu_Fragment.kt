package com.example.restbuensabor

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Menu_Fragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmento = inflater.inflate(R.layout.fragment_menu, container, false) //hace visible el fragmento
        val detail1: Button = fragmento.findViewById(R.id.btnbreak)
        val detail2: Button = fragmento.findViewById(R.id.btnlunch)
        val detail3: Button = fragmento.findViewById(R.id.btndinner)
        val detail4: Button = fragmento.findViewById(R.id.btnsnacks)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle() //paquete de informacion (Bundle)
            datos.putString("tarea","ir algun lado" ) //resources.getString(R.string.txt_tarea_1
            datos.putString("hora", "10:00")
            datos.putString("lugar", "mini market")
            activity?.supportFragmentManager?.beginTransaction() //este se puede crear en una funcion
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, Menu_Fragment_Detail::class.java, datos, "detail")
                ?.addToBackStack("") //apila los fragmentos
                ?.commit()


        })

        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", "ir algun lado")
            datos.putString("hora", "13:00")
            datos.putString("lugar", "Renaul Taller")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, Menu_Fragment_Detail::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()


        })

        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", "ir algun otro lado")
            datos.putString("hora", "14:00")
            datos.putString("lugar", "Laundry park")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, Menu_Fragment_Detail::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()


        })

        detail4.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", "ir algun otro lado")
            datos.putString("hora", "14:00")
            datos.putString("lugar", "Laundry park")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, Menu_Fragment_Detail::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()


        })
        return fragmento

    }

}
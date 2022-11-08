package com.example.restbuensabor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Login : AppCompatActivity() {

    private var edtUserName: EditText? = null
    private var edtPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtUserName = findViewById(R.id.edtuser)
        edtPassword = findViewById(R.id.edtpass)
    }
    fun onLogin(btnlogin: View){
        if((edtUserName!!.text.toString()=="admin") && (edtPassword!!.text.toString()=="admin")){
            val intento = Intent(this,MainActivity::class.java)
            startActivity(intento)
        }
        else{
            val dialog = AlertDialog.Builder(this).setTitle("¡ERROR!")
                .setMessage(R.string.mensajeError).create().show()


        }

    }

    /*fun onRegister(btnregister:View){
        val regis = Intent(this, Register::class.java)
        startActivity(regis)
    }*/


}
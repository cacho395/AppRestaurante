package com.example.restaurante

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    val positiveButton= {dialog:DialogInterface, which:Int ->
        val cancel = Intent(this, MainActivity::class.java)
        startActivity(cancel)
    }

    val negativeButton={ xx: DialogInterface, yy:Int->
        Toast.makeText(this, "Canceled for user", Toast.LENGTH_SHORT).show()
    }
    fun onContinue(btncontinue: View){

        val btndialog = AlertDialog.Builder(this).setTitle("Registred")
            .setMessage(resources.getString(R.string.alt_userpass))
            .create().show()
        val cancel = Intent(this, MainActivity::class.java)
        startActivity(cancel)
        Toast.makeText(this,"User registred success", Toast.LENGTH_LONG).show()
    }
    fun onCancel(btncancel: View){

        val btndialog = AlertDialog.Builder(this).setTitle("canceled")
            .setMessage(resources.getString(R.string.alt_cancel))
            .setPositiveButton("Ok", positiveButton)
            .setNegativeButton("Cancel",negativeButton)
            .create().show()
    }

}
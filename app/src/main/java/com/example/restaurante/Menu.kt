package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.view.Menu
import android.widget.Button
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, MenuFragment::class.java, null, "menu")
                .commit()
        }
    }


    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.search ->{
            Toast.makeText(this, "Searching .......", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.contact->{
            Toast.makeText(this, (R.string.contact), Toast.LENGTH_SHORT).show()
            true
        }
        R.id.help->{
            Toast.makeText(this, (R.string.help), Toast.LENGTH_SHORT).show()
            true
        }
        else ->{
            super.onOptionsItemSelected(item)
        }


    }



}
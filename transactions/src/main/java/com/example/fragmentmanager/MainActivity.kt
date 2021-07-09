package com.example.fragmentmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentmanager.add.AddActivity
import com.example.fragmentmanager.add_plus_add_to_backstack.AddPlusAddToBackStackActivity
import com.example.fragmentmanager.replace.ReplaceActivity
import com.example.fragmentmanager.replace_plus_add_to_backstack.ReplacePlusAddToBackStackActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this,AddActivity::class.java))
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this, AddPlusAddToBackStackActivity::class.java))
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            startActivity(Intent(this, ReplaceActivity::class.java))
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            startActivity(Intent(this, ReplacePlusAddToBackStackActivity::class.java))
        }
    }
}
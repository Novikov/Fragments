package com.example.fragmentmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentmanager.add.AddActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this,AddActivity::class.java))
        }
    }
}
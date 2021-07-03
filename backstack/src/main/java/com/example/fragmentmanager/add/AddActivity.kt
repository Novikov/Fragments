package com.example.fragmentmanager.add

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentmanager.R
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter

class AddActivity : AppCompatActivity(R.layout.activity_add) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = findViewById<Button>(R.id.addButton)
        val templateFragmentAdapter = TemplateFragmentAdapter()
        button.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.add_activity_fragment_container,templateFragmentAdapter.createFragment()).commit()
        }
    }
}
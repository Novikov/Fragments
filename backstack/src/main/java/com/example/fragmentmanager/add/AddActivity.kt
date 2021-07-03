package com.example.fragmentmanager.add

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.fragmentmanager.R
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter

class AddActivity : AppCompatActivity(R.layout.activity_add) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val templateFragmentAdapter = TemplateFragmentAdapter()

        val addFragmentButton = findViewById<Button>(R.id.addButton)
        addFragmentButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.add_activity_fragment_container, templateFragmentAdapter.createFragment())
                .commit()
        }

        val popFragmentButton = findViewById<Button>(R.id.pop_button)
        popFragmentButton.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        supportFragmentManager.addOnBackStackChangedListener {
            val backStackEntryContTextView:TextView = findViewById(R.id.back_stack_count_text_view)
            backStackEntryContTextView.text = supportFragmentManager.backStackEntryCount.toString()
        }
    }
}
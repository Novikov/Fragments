package com.example.fragmentmanager.add_plus_add_to_backstack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.fragmentmanager.R
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter

class AddPlusAddToBackStackActivity : AppCompatActivity(R.layout.activity_add) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = findViewById<Button>(R.id.addButton)
        val templateFragmentAdapter = TemplateFragmentAdapter()
        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.add_activity_fragment_container, templateFragmentAdapter.createFragment())
                .addToBackStack(null)
                .commit()
        }

        val popFragmentButton = findViewById<Button>(R.id.pop_button)
        popFragmentButton.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        val removeButton = findViewById<Button>(R.id.remove_button)
        removeButton.setOnClickListener {
            val currentFragment = supportFragmentManager.findFragmentById(R.id.add_activity_fragment_container)
            supportFragmentManager.beginTransaction().remove(currentFragment!!).commit()
        }

        supportFragmentManager.addOnBackStackChangedListener {
            val backStackEntryContTextView:TextView = findViewById(R.id.back_stack_count_text_view)
            backStackEntryContTextView.text = supportFragmentManager.backStackEntryCount.toString()
        }
    }
}
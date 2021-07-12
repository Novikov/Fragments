package com.example.fragmentmanager

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentmanager.databinding.ActivityMainBinding
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val templateFragmentAdapter = TemplateFragmentAdapter()

        binding.addButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.add_activity_fragment_container, templateFragmentAdapter.createFragment())
                .commit()

            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }

        binding.popButton.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        binding.removeButton.setOnClickListener {
                        val currentFragment = supportFragmentManager.findFragmentById(R.id.add_activity_fragment_container)
            supportFragmentManager.beginTransaction().remove(currentFragment!!).commit()
        }

        supportFragmentManager.addOnBackStackChangedListener {
                binding.backStackCountTextView.text = supportFragmentManager.backStackEntryCount.toString()
        }
    }
}
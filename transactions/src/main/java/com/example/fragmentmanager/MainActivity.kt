package com.example.fragmentmanager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentmanager.databinding.ActivityMainBinding
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val templateFragmentAdapter = TemplateFragmentAdapter()

        binding.backStackCountTextView.text = supportFragmentManager.backStackEntryCount.toString()

        binding.addButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, templateFragmentAdapter.createFragment())
                .commit()
        }

        binding.addToBackStackButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, templateFragmentAdapter.createFragment())
                .addToBackStack(TAG)
                .commit()
        }

        binding.replaceButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, templateFragmentAdapter.createFragment())
                .commit()
        }

        binding.replaceAndAddToBackStackButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, templateFragmentAdapter.createFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.removeButton.setOnClickListener {
            val currentFragment = supportFragmentManager.fragments.first()
            supportFragmentManager.beginTransaction().remove(currentFragment).commit()
        }

        //Удалит фрагмент и положет такой же в бекстек
        binding.removeAndAddToBackstackButton.setOnClickListener {
            val currentFragment = supportFragmentManager.fragments.first()
            supportFragmentManager.beginTransaction().remove(currentFragment).addToBackStack(null)
                .commit()
        }

        binding.hideButton.setOnClickListener {
            val currentFragment = supportFragmentManager.fragments.first()
            supportFragmentManager.beginTransaction()
                .hide(currentFragment)
                .commit()
        }

        binding.showButton.setOnClickListener {
            val currentFragment = supportFragmentManager.fragments.first()
            supportFragmentManager.beginTransaction()
                .show(currentFragment)
                .commit()
        }

        binding.popButton.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        binding.popImmediate.setOnClickListener {
            val res = supportFragmentManager.popBackStackImmediate()
            Log.i(TAG, "$res")
        }

        supportFragmentManager.addOnBackStackChangedListener {
            binding.backStackCountTextView.text =
                supportFragmentManager.backStackEntryCount.toString()
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
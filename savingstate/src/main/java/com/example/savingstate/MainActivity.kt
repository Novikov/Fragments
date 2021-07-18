package com.example.savingstate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "savedInstantState is null - ${savedInstanceState==null} ")
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, SavingStateFragment.newInstance())
                .commit()
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
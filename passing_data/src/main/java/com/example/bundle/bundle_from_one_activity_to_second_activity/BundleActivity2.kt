package com.example.bundle.bundle_from_one_activity_to_second_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.bundle.R

class BundleActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle2)
        val textView = findViewById<TextView>(R.id.passed_data_text_view)
        textView.text = intent.getStringExtra(TAG)
    }

    companion object {
        const val TAG = "BundleActivity2"
    }
}
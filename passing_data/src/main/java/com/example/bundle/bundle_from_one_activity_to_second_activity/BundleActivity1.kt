package com.example.bundle.bundle_from_one_activity_to_second_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.bundle.R

class BundleActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle1)

        val editText = findViewById<EditText>(R.id.data_edittext)

        val sendDataButton = findViewById<Button>(R.id.pass_data_button)
        sendDataButton.setOnClickListener {
            val intent = Intent(this, BundleActivity2::class.java)
            val bundle = Bundle()
            bundle.putString(BundleActivity2.TAG, editText.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
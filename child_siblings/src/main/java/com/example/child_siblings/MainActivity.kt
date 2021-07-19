package com.example.child_siblings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.child_siblings.child.ChildFragmentsActivity
import com.example.child_siblings.siblings.SiblingsFragmentsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val childFragmentsButton = findViewById<Button>(R.id.child_button)
        childFragmentsButton.setOnClickListener {
            startActivity(Intent(this,ChildFragmentsActivity::class.java))
        }

        val siblingsFragmentsButton = findViewById<Button>(R.id.siblings_button)
        siblingsFragmentsButton.setOnClickListener {
            startActivity(Intent(this,SiblingsFragmentsActivity::class.java))
        }

    }
}
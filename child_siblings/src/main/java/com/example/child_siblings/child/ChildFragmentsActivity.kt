package com.example.child_siblings.child

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.child_siblings.R

class ChildFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_fragments)
        if (savedInstanceState==null){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.parent_fragment_container_view, ParentFragment.newInstance())
                .commit()
        }
    }
}
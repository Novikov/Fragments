package com.example.child_siblings.child

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.child_siblings.R

class ParentFragment : Fragment(R.layout.parent_fragment) {

     var parentTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            childFragmentManager
                .beginTransaction()
                .replace(R.id.child_fragment_container_view, ChildFragment.newInstance())
                .commit()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val parentButton = view.findViewById<Button>(R.id.parent_fragment_button)
        parentTextView = view.findViewById(R.id.parent_text_view)
        parentButton.setOnClickListener {
            (childFragmentManager.fragments[0] as ChildFragment).updateUI("Hello from parent")
        }
    }

    companion object {
        private const val TAG = "ParentFragment"

        fun newInstance() = ParentFragment()
    }

    fun updateUI(msg: String) {
        parentTextView!!.text = msg
    }

    override fun onDestroyView() {
        super.onDestroyView()
        parentTextView = null
    }
}
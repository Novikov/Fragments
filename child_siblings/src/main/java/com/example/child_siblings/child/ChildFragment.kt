package com.example.child_siblings.child

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.child_siblings.R
import kotlin.random.Random

class ChildFragment : Fragment(R.layout.child_fragment) {
    var childTextView: TextView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        childTextView = view.findViewById(R.id.child_text_view)
        val childButton = view.findViewById<Button>(R.id.child_fragment_button)
        childButton.setOnClickListener {
            (parentFragment as ParentFragment).updateUI("Hello from child")
        }
    }

    companion object {
        private const val TAG = "ChildFragment"

        fun newInstance() = ChildFragment()
    }

    fun updateUI(msg: String) {
        childTextView!!.text = msg
    }

    override fun onDestroyView() {
        super.onDestroyView()
        childTextView = null
    }
}
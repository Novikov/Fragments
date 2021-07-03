package com.example.fragmentmanager.fragment_templates

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.fragmentmanager.R
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter.Companion.ARG_OBJECT
import java.util.*


class TemplateFragment : Fragment(R.layout.fragment_template) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        val constraintLayout =
            view?.findViewById<ConstraintLayout>(R.id.fragment_template_container)

        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        constraintLayout?.setBackgroundColor(color)

        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val textView: TextView? = view?.findViewById(R.id.template_fragment_number)
            textView?.text = getInt(ARG_OBJECT).toString()
        }

        return view
    }
}
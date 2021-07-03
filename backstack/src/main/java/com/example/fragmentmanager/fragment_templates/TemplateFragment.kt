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
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter.Companion.HEIGHT
import com.example.fragmentmanager.fragment_templates.TemplateFragmentAdapter.Companion.POSITION
import java.util.*


class TemplateFragment : Fragment(R.layout.fragment_template) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        val fragment_container =
            view?.findViewById<ConstraintLayout>(R.id.fragment_template_container)

        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        fragment_container?.setBackgroundColor(color)

        arguments?.takeIf { it.containsKey(POSITION) }?.apply {
            val textView: TextView? = view?.findViewById(R.id.template_fragment_number)
            textView?.text = getInt(POSITION).toString()
        }

        arguments?.takeIf { it.containsKey(HEIGHT) }?.apply {
            fragment_container?.maxHeight = getInt(HEIGHT)
        }

        return view
    }
}
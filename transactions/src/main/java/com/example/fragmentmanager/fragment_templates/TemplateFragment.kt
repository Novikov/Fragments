package com.example.fragmentmanager.fragment_templates

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
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
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: ")
    }

    


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView: ")
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

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach: ")
    }
    

    companion object {
        private const val TAG = "TemplateFragment"
    }

}
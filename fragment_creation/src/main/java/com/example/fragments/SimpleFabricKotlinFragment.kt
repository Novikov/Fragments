package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

//Новый синтаксис
class SimpleFabricKotlinFragment() : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<TextView>(R.id.textView)
        tv.text = arguments?.getInt("tag_name").toString()
    }

    companion object{
        fun newInstance(param:Int): SimpleFabricKotlinFragment {
            val args = Bundle()
            args.putInt("tag_name",param)
            val fragment = SimpleFabricKotlinFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
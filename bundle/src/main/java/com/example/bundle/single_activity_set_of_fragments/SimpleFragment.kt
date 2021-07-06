package com.example.bundle.single_activity_set_of_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bundle.R

class SimpleFragment : Fragment(R.layout.fragment_simple) {

    companion object {
        fun newInstance(param: String): SimpleFragment {
            val fragment = SimpleFragment()
            fragment.arguments = Bundle()
            return fragment
        }

    }
}
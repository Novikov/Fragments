package com.example.savingstate

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class SimpleFragment : Fragment(R.layout.simple_fragment) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "savedInstantState is null - ${savedInstanceState==null} ")
    }


    companion object {
        const val TAG = "SimpleFragment"

        fun newInstance(): SimpleFragment {
            val args = Bundle()
            val fragment = SimpleFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
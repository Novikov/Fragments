package com.example.savingstate

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class SavingStateFragment : Fragment(R.layout.saving_state) {

    //Состояние свойства не сохранится
    var textFromEditText:String = ""

    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(), textFromEditText, Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Состояние view сохранится если есть id
        val editText = view.findViewById<EditText>(R.id.editTextTextPersonName)
        editText.setOnClickListener {
            textFromEditText = editText.text.toString()
        }
    }

    companion object {
        private const val TAG = "SavingStateString"

        fun newInstance(): SavingStateFragment{
            val args = Bundle()
            val fragment = SavingStateFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
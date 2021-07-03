package com.example.fragmentmanager.fragment_templates

import android.os.Bundle

class TemplateFragmentAdapter {
    private var position = 0

    fun createFragment(): TemplateFragment {
        val fragment = TemplateFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position)
            position++
        }
        return fragment
    }

    companion object {
        const val ARG_OBJECT = "object"
    }
}
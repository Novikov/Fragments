package com.example.fragmentmanager.fragment_templates

import android.os.Bundle

class TemplateFragmentAdapter {
    private var position = 1
    private var height = 1200

    fun createFragment(): TemplateFragment {
        val fragment = TemplateFragment()
        fragment.arguments = Bundle().apply {
            putInt(POSITION,position)
            putInt(HEIGHT,height)
            position++
            height -= 10
        }
        return fragment
    }

    companion object {
        const val POSITION = "position"
        const val HEIGHT = "height"
    }
}
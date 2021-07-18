package com.example.bundle.single_activity_set_of_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bundle.R

class SingleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_actitivy)
        supportFragmentManager.addOnBackStackChangedListener {
            Log.i("BackStackSize", "backstack size - ${supportFragmentManager.backStackEntryCount}")
        }

        //Если убрать данную проверку то при перевороте экррана будет добавляться клон текущего фрагмента
        if (savedInstanceState==null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, SimpleFragment.newInstance("1")).addToBackStack(null)
                .commit()
        }
    }

    companion object {
        private const val TAG = "SingleActivity"
    }
}
package com.example.fragments

import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Проверка на то, был ли уже добавлен фрагмент.
        //Если savedInstanceState не null, то андройд восстановит фрагмент сам
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .setReorderingAllowed(true) //данный метод необходим для отмены выполнения жизненного цикла промежуточных фрагментов. Они не будут показаны пользователю, соответственно нет необходимости например выполнять их анимации
                .add(R.id.host_fragment, SimpleFabricKotlinFragment.newInstance(5))
                .commit()
        }


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }




}
package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val darkButton = findViewById<Button>(R.id.darkBtn)
        val readButton = findViewById<Button>(R.id.readbtn)
        val layout =findViewById<LinearLayout>(R.id.LinearLayout)

        darkButton.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        readButton.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}
package com.example.aplikasi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LandingPage : AppCompatActivity() {

    lateinit var button : Button
    lateinit var button2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        button()
    }

    fun button() {
        button = findViewById(R.id.login)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        button2 = findViewById(R.id.register)
        button2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
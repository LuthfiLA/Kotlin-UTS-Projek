package com.example.aplikasi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPassword : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        button()
    }

    fun button() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
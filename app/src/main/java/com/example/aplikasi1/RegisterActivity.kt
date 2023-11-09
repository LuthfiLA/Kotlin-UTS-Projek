package com.example.aplikasi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.aplikasi1.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    lateinit var button: Button
    lateinit var button2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button()
        button2()
    }
    fun button() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    fun button2() {
        button2 = findViewById(R.id.login)
        button2.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
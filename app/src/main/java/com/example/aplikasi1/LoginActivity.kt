package com.example.aplikasi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.aplikasi1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var button : Button
    lateinit var button2 : TextView
    lateinit var button3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button()
    }

    fun button() {
        button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        button2 = findViewById(R.id.btn_register)
        button2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        button3 = findViewById(R.id.forgot)
        button3.setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
        }
    }
}
package com.example.aplikasi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.aplikasi1.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(FHome())

        var bottomnvamenu = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomnvamenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.botmenu_Home ->{
                    loadFragment(FHome())
                    true
                }
                R.id.botmenu_Calculator ->{
                    loadFragment(Fcalculator())
                    true
                }
                R.id.botmenu_BMI ->{
                    loadFragment(Fbmi())
                    true
                }
                R.id.botmenu_Money ->{
                    loadFragment(FMoney())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }


}
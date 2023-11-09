package com.example.aplikasi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.aplikasi1.databinding.FragmentFbmiBinding
import kotlin.math.pow

class Fbmi : Fragment() {

    private lateinit var binding : FragmentFbmiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFbmiBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculateBtn.setOnClickListener {
            calculateBMI()
        }
    }

    private fun calculateBMI(){
        val weight = binding.weightEdit.text.toString().toFloatOrNull()
        val height = binding.heightEdit.text.toString().toFloatOrNull()

        if (weight != null && height != null){
            val bmi = weight/(height/100).pow(2)
            val bmiResult = String.format("%.2f",bmi)

            val bmiCategory = when {
                bmi < 18.5 -> "Berat Rendah"
                bmi < 25 -> "Berat Ideal"
                bmi < 30 -> "Berat Tinggi"
                else -> "Obesitas"
            }
            binding.resultText.text = "$bmiResult\n$bmiCategory"
        }else {
            binding.resultText.text = "Data tidak valid"
        }
    }
}
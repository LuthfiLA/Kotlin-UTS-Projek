package com.example.aplikasi1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.aplikasi1.databinding.FragmentFMoneyBinding

class FMoney : Fragment() {

    private lateinit var binding: FragmentFMoneyBinding
    private var pilihan = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFMoneyBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hitung.setOnClickListener {
            konversiMataUang()
        }
        binding.proses.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Log.d("ilyas", "pilih item: $p2")
                pilihan = p2
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                // Do nothing
            }
        }
    }

    private fun konversiMataUang() {
        val money = binding.bilangan1.text.toString().toDouble()
        val out = binding.output
        var hasil = 0.0

        if (pilihan == 0) {
            hasil = money / 15000
        } else if (pilihan == 1) {
            hasil = money / 279.62
        } else if (pilihan == 2) {
            hasil = money / 3339.28
        } else if (pilihan == 3) {
            hasil = money / 16747.56
        }

        out.text = hasil.toString()
        }

}
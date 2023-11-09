package com.example.aplikasi1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.aplikasi1.databinding.FragmentFHomeBinding

class FHome : Fragment() {

    private lateinit var binding: FragmentFHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFHomeBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnLogout.setOnClickListener {
            logout()
        }
    }


    private fun logout() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Confirm Logout")
        builder.setMessage("Are you sure you want to Logout?")

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
        builder.setNegativeButton(android.R.string.no) { dialog, which ->
            dialog.dismiss()
        }
        builder.show()
    }
}
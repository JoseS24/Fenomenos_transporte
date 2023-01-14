package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria5Binding

class analisisTeoria5 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirProp34.setOnClickListener {
            val intent = Intent(this, entradaAnalisis::class.java)
            startActivity(intent)
        }
    }
}
package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria4Binding

class analisisTeoria4 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seguirProp12.setOnClickListener {
            val intent = Intent(this, analisisTeoria5::class.java)
            startActivity(intent)
        }
    }
}
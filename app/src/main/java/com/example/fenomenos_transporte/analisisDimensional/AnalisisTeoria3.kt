package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria3Binding

class analisisTeoria3 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.psr3.setOnClickListener {
            val intent = Intent(this, analisisTeoria4::class.java)
            startActivity(intent)
        }
    }
}
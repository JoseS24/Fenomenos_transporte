package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria2Binding

class analisisTeoria2 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.psr2.setOnClickListener {
            val intent = Intent(this, analisisTeoria3::class.java)
            startActivity(intent)
        }
    }
}
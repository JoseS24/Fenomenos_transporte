package com.example.fenomenos_transporte.analisisDimensional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityAnalisisTeoria1Binding

class analisisTeoria1 : AppCompatActivity() {
    private lateinit var binding: ActivityAnalisisTeoria1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalisisTeoria1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.psr1.setOnClickListener {
            val intent = Intent(this, analisisTeoria2::class.java)
            startActivity(intent)
        }
    }
}
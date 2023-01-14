package com.example.fenomenos_transporte.viscosidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.fenomenos_transporte.R
import com.example.fenomenos_transporte.databinding.ActivityViscosidadEjemplo4Binding
import com.example.fenomenos_transporte.numeroReynolds.entradaNumReynolds

class viscosidadEjemplo4 : AppCompatActivity() {
    private lateinit var binding: ActivityViscosidadEjemplo4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViscosidadEjemplo4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vPaso4.setOnClickListener {
            val intent = Intent(this, viscosidadEjemplo5::class.java)
            startActivity(intent)
        }
        binding.vPaso3.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Alerta")
                .setMessage("¿Quiere regresar al paso anterior?")
                .setPositiveButton("Si") { _, _ ->
                    val intent = Intent(this, viscosidadEjemplo3::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No") { _, _ -> }
                .create().show()
        }
    }
}
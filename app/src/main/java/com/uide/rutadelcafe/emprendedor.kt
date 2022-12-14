package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var crearReserva: Button
lateinit var homeEmprendedor: Button

class emprendedor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emprendedor)

        crearReserva = findViewById(R.id.irAReserva)
        crearReserva.setOnClickListener {
            intent = Intent(this, reserva::class.java)
            startActivity(intent)
        }

        homeEmprendedor = findViewById(R.id.homeCompra)
        homeEmprendedor.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        }
    }
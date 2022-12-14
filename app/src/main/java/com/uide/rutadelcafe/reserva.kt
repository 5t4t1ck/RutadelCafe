package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var realizarCompra: Button
lateinit var homeReserva: Button

class reserva : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserva)

        homeReserva = findViewById(R.id.homeCompra)
        homeReserva.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        realizarCompra = findViewById(R.id.realizarCompra)
        realizarCompra.setOnClickListener {
            intent = Intent(this, compra::class.java)
            startActivity(intent)
        }
    }
}
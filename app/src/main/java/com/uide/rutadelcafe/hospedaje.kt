package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var HomeHospedaje: Button


class hospedaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospedaje)

        HomeHospedaje = findViewById<Button>(R.id.homeCompra)
        HomeHospedaje.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}
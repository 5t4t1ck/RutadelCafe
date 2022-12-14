package com.uide.rutadelcafe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnCategoriaHospedaje = findViewById(R.id.categoriaHospedaje)
        btnCategoriaHospedaje.setOnClickListener {
            intent = Intent(this, hospedaje::class.java)
            startActivity(intent)
        }
        btnCategoriaComida = findViewById(R.id.categoriaComida)
        btnCategoriaComida.setOnClickListener {
            intent = Intent(this, comida::class.java)
            startActivity(intent)
        }

        btnCategoriaTurismo = findViewById(R.id.categoriaTurismo)
        btnCategoriaTurismo.setOnClickListener {
            intent = Intent(this, turismo::class.java)
            startActivity(intent)
        }
    }
}
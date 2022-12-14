package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var realizarOtraCompra: Button
lateinit var homeCompra: Button

class compra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra)

        realizarOtraCompra = findViewById(R.id.realizarOtraCompra)
        realizarOtraCompra.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        homeCompra = findViewById(R.id.homeCompra)
        homeCompra.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}
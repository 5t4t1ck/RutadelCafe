package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

lateinit var HomeComida: Button
lateinit var btncomida001:Button
lateinit var btncomida002:Button
lateinit var btncomida003:Button
lateinit var btncomida004:Button
lateinit var btncomida005:Button
lateinit var btncomida006:Button
lateinit var btncomida007:Button
lateinit var btncomida008:Button
lateinit var btncomida009:Button
lateinit var btncomida010:Button
lateinit var btncomida011:Button
lateinit var btncomida012:Button
lateinit var btncomida013:Button

class comida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        HomeComida = findViewById<Button>(R.id.homeComida)
        HomeComida.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        btncomida001 = findViewById<Button>(R.id.comida001)
        btncomida001.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida002 = findViewById<Button>(R.id.comida002)
        btncomida002.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida003 = findViewById<Button>(R.id.comida003)
        btncomida003.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida004 = findViewById<Button>(R.id.comida004)
        btncomida004.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida005 = findViewById<Button>(R.id.comida005)
        btncomida005.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida006 = findViewById<Button>(R.id.comida007)
        btncomida006.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida008 = findViewById<Button>(R.id.comida008)
        btncomida008.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida009 = findViewById<Button>(R.id.comida009)
        btncomida009.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida010 = findViewById<Button>(R.id.comida010)
        btncomida010.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida011 = findViewById<Button>(R.id.comida011)
        btncomida011.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida012 = findViewById<Button>(R.id.comida012)
        btncomida012.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

        btncomida013 = findViewById<Button>(R.id.comida013)
        btncomida013.setOnClickListener {
            intent = Intent(this, emprendedor::class.java)
            startActivity(intent)
        }

    }
}
package com.uide.rutadelcafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var HomeTurismo: Button


class turismo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_turismo)

        HomeTurismo = findViewById<Button>(R.id.homeTurismo)
        HomeTurismo.setOnClickListener {
            intent = Intent(this, home::class.java)
            startActivity(intent)
        }

    }
}
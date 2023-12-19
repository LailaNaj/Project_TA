package com.example.rental_sepeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PembayaranActivity : AppCompatActivity() {
    private lateinit var buttonbayar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        buttonbayar = findViewById(R.id.buttonbayar)

        buttonbayar.setOnClickListener {
            startActivity(Intent(this, SelesaiActivity::class.java))
        }
    }
}
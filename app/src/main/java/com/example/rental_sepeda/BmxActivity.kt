package com.example.rental_sepeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BmxActivity : AppCompatActivity() {
    private lateinit var buttonBooking: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmx)

        buttonBooking = findViewById(R.id.buttonBooking)

        buttonBooking.setOnClickListener {
            startActivity(Intent(this, PembayaranActivity::class.java))
        }
    }
}
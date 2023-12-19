package com.example.rental_sepeda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SearchActivity : AppCompatActivity() {

    private lateinit var buttonRent1: Button
    private lateinit var buttonRent2: Button
    private lateinit var buttonRent3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        buttonRent1 = findViewById(R.id.buttonRent1)
        buttonRent2 = findViewById(R.id.buttonRent2)
        buttonRent3 = findViewById(R.id.buttonRent3)

        buttonRent1.setOnClickListener {
            startActivity(Intent(this, BmxActivity::class.java))
        }

        buttonRent2.setOnClickListener {
            startActivity(Intent(this, HybridActivity::class.java))
        }

        buttonRent3.setOnClickListener {
            startActivity(Intent(this, TouringActivity::class.java))
        }
    }
}
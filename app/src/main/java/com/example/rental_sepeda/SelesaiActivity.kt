package com.example.rental_sepeda

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SelesaiActivity : AppCompatActivity() {
    private lateinit var buttonHome: Button
    private lateinit var buttonWA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai)

        buttonHome = findViewById(R.id.buttonHome)
        buttonWA = findViewById(R.id.buttonWA)

        buttonHome.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        buttonWA.setOnClickListener {
            openWhatsAppChat()
        }
    }

    private fun openWhatsAppChat() {
        val phoneNumber = "+6282288512573"
        val message = "Hallo kak"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber&text=$message")
        startActivity(intent)
    }
}

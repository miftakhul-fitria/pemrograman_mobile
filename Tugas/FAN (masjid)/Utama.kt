package com.example.fan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_utama.*

class Utama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)

        val context = this

        button1.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(context, Identitas::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(context, Pengumuman::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(context, Slideshow::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(context, Marquee::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(context, Tagline::class.java)
            startActivity(intent)
        }
    }
}

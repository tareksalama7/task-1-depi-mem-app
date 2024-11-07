package com.example.myapplication00

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memeImage: ImageView = findViewById(R.id.memeImageView)
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val ageTextView: TextView = findViewById(R.id.ageTextView)

        nameTextView.text = "My Name is Tarek"
        ageTextView.text = "My Age = 21"
    }
}

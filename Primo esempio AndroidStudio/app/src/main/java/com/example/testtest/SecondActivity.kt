package com.example.testtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val nameTv: TextView = findViewById(R.id.name_tv_second)

        val nome = intent.getStringExtra(NAME)

        nameTv.text = "Ciao $nome"
    }
}
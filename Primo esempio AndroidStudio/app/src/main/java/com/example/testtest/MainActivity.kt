package com.example.testtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val NAME = "name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textMain: TextView = findViewById(R.id.text_main)
        val invio : Button = findViewById(R.id.button2_main)
        val editText: EditText = findViewById(R.id.edit_text_main)
        val buttonMain: Button = findViewById(R.id.button_main)

        invio.setOnClickListener {
            val testo = editText.text
            textMain.text = testo
        }
        buttonMain.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(NAME, editText.text.toString())
            startActivity(intent)
        }
    }
}
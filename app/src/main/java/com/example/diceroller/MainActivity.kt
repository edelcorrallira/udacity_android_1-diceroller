package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            resultText.text = rollDice().toString()
        }
    }

    private fun rollDice():Int {
        return Random().nextInt(6) + 1
    }
}

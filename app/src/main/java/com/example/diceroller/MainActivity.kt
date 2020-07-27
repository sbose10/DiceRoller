package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            // To make the button interactive and show a message
            val toast = Toast.makeText(this, "Dice Rolled - YAY", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun rollDice() {
        // New Dice object created with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Updates the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}











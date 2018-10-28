package com.jakub.tipcalculator

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoMessage.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = percentageEditText.text.toString().toDouble() / 100

            val tip = bill * tipPercentage
            val total = bill + tip

            infoMessage.visibility = View.VISIBLE
            infoMessage.text = "Tip: ${doubleRound(tip)} Total: ${doubleRound(total)}"

        }

    }

    fun doubleRound(number : Double): String{
        return String.format("%.2f", number)
    }
}

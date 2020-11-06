package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        NumberButton.setOnClickListener {
            val number: Int = randomNumber()
            d("ButtonClicked", "$number")
            textView.text = number.toString()
            if (number > 0 && number % 5 == 0) {
                textView.text = "Yes"
            } else {
                textView.text = "No"
            }
        }

        }
        private fun randomNumber() = (-100..100).random()
}


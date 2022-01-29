package com.ndkp.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        morningBtn.setOnClickListener {
            greetingText.text = "ohayo"
        }
        afternoonBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_afternoon_text)
        }
        eveningBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_evening_text)
        }

    }
}
package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Define Button
        val clickMeBtn = findViewById<Button>(R.id.clickme)

        //Define TextVew
        val textView = findViewById<TextView>(R.id.hello)!!

        //Define Count Variable
        var timesClicked = 0

        //Defining set on click listener
        clickMeBtn.setOnClickListener{
            timesClicked += 1
            textView.text = timesClicked.toString()
        }
    }
}
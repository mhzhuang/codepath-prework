package com.example.helloandroid

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.TypedArrayUtils.getText
import com.google.android.material.textfield.TextInputEditText

// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'
        // User can tap a button to change the text color of the label
        // 1. Add a button to our layout

        // Get a reference to button
        // 2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // handle button tap
            // 2. Change the color of the text
            Log.i("Minhui", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }

        // Change string text
        findViewById<Button>(R.id.button2).setOnClickListener {
            //EditText simpleEditText = (EditText) findViewById(R.id.et_simple);
            //String strValue = simpleEditText.getText().toString();
            findViewById<TextView>(R.id.textView).text =
                findViewById<EditText>(R.id.et_simple).getText()
        }

        // Change view color
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.mint))
        }
    }
}



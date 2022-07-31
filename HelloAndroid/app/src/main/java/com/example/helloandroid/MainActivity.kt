package com.example.helloandroid

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)


        // ### Required User Stories
        // 1. User sees custom text in a label - Hello from {name}!
        // Complete in file activity_main.xml

        //2. User see's custom background color.
        // Complete in file activity_main.xml

        // 3. User can tap a button to change the text color of the label.
        findViewById<Button>(R.id.button).setOnClickListener {
            //Log.i("Minhui", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }

        // ### Optional User Stories
        // 1. User can tap a button to change the color of the background view.
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.mint))
        }

        // 2. User can tap a button to change the text string of the label - Goodbye 👋.
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.textView).text="Goodbye \uD83D\uDC4B"
        }

        // 3. User can tap on the background view to reset all views to default settings.
        findViewById<View>(R.id.backgroundView).setOnClickListener {
            findViewById<TextView>(R.id.textView).text="Hello from Minhui"
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.userdefined))
        }

        // 4. User can update the label text with custom text entered into the text field.

        findViewById<Button>(R.id.button2).setOnClickListener {
            // a. User can enter text into a text field using the keyboard.
            var textView = findViewById<EditText>(R.id.et_simple).text
            // b. User can tap the "Change text string" button to update the label with the text from the text field.
            if (!textView.toString().equals("")) {
                findViewById<TextView>(R.id.textView).text = textView.toString()
            } else {
                // c. If the text field is empty, update label with default text string.
                findViewById<TextView>(R.id.textView).text = "Hello CodePath"
            }
            // d. The keyboard is dismissed after the button has been tapped.
            hideKeyboard(this, findViewById(android.R.id.content));
        }
    }

    // Hide Keyboard Function
    fun hideKeyboard(context: Context, view: View) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}




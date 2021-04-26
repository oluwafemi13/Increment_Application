package com.example.incrementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incremement()
    }


    private fun incremement() {
        val button = findViewById<MaterialButton>(R.id.button)


        button.setOnClickListener(){

            for(i in 1..100){
                val message =i

                val textView = findViewById<MaterialTextView>(R.id.text_view).apply {
                    text = message.toString()
                }
            }
        }

    }
}
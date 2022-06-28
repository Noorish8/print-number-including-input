package com.example.printnumberincludinginput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtInput: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        button=findViewById(R.id.btn)
        txtInput=findViewById(R.id.et_number)

        button.setOnClickListener {
            val inputNumber = txtInput.text.toString().toInt()
          //println(inputNumber)
            if (inputNumber < 0 || inputNumber > 100) {
               println(inputNumber)

            } else {
                for (i in inputNumber..(inputNumber + 10)) {
                 println(i)
                }

            }
        }}}








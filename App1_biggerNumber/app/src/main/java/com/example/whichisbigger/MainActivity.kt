package com.example.whichisbigger

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var random = Random()
        print(random.ints())
        var ele = findViewById<TextView>(R.id.id)
        var bun: Button = findViewById(R.id.left)
        bun.setOnClickListener{
            print("Hello")
            var num = ele.text.toString().toInt()
            num+=1
            ele.text = num.toString()
        }


    }
}
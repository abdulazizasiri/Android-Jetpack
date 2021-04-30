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
        var current : TextView = findViewById(R.id.number)

        var leftBtn: Button = findViewById(R.id.left)
        var rightBtn: Button = findViewById(R.id.right)


        leftBtn.setOnClickListener{

            decrement(current, true)
        }

        rightBtn.setOnClickListener{
            decrement(current, false)
        }


    }

    fun decrement(curr: TextView, isDec: Boolean) {
        var num = curr.text.toString().toInt()
        if (num == 0) {
            return
        }
        if (isDec) {
            num--;
        } else {
            num++
        }
        curr.text = "${num}"
    }

}
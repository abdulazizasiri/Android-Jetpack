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
        var leftBtn: Button = findViewById(R.id.left)
        var rightBtn: Button = findViewById(R.id.right)


        leftBtn.setOnClickListener{

            decrement(leftBtn, rightBtn)
        }


    }

    fun decrement(leftBtn: Button, rightBtn:Button) {
        var num = leftBtn.text.toString().toInt()
        if (num == 0) {
            return
        }
        num--;
        leftBtn.text = "-:${num}"
        rightBtn.text = "+:${num}"
    }
}
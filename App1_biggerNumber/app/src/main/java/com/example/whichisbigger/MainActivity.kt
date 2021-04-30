package com.example.whichisbigger

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var current : TextView = findViewById(R.id.number)

        var submit = findViewById<Button>(R.id.check)
        var leftBtn: Button = findViewById(R.id.left)
        var rightBtn: Button = findViewById(R.id.right)


        leftBtn.setOnClickListener{

            changeValue(current, true)
        }

        rightBtn.setOnClickListener{
            changeValue(current, false)
        }

        submit.setOnClickListener{
            checkValue(current)
        }


    }
    @SuppressLint("ResourceAsColor")
    fun checkValue(current: TextView){
        var currentValue = 21 /// Vurrently. I am bored, I want to move on.
        if (current.text.toString().toInt() == currentValue) {
            findViewById<ConstraintLayout>(R.id.bg).setBackgroundColor(R.color.teal_700)
        }
    }
    fun changeValue(curr: TextView, isDec: Boolean) {
        var num = curr.text.toString().toInt()
        if (num == 0 && isDec) {
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
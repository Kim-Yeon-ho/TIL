package com.example.linearlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_layout)

        val btn1 : Button = findViewById(R.id.button)
        val btn2 : Button = findViewById(R.id.button2)
        val btn3 : Button = findViewById(R.id.button3)


        btn1.setOnClickListener {
            Toast.makeText(this,"버튼1 클릭됨!",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this,"버튼2 클릭됨!",Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this,"버튼3 클릭됨!",Toast.LENGTH_SHORT).show()
        }

    }
}
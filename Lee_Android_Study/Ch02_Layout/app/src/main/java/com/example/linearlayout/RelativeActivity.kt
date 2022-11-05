package com.example.linearlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)
        val btn3 : Button = findViewById(R.id.btn3)


        btn1.setOnClickListener {
            Toast.makeText(this,"요소1 클릭됨!",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this,"요소2 클릭됨!",Toast.LENGTH_SHORT).show()
        }


        btn3.setOnClickListener {
            Toast.makeText(this,"요소3 클릭됨!",Toast.LENGTH_SHORT).show()
        }



    }
}
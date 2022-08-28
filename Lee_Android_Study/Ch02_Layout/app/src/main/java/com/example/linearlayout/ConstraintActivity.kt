package com.example.linearlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        val btn1 : Button = findViewById(R.id.button4)
        val btn2 : Button = findViewById(R.id.button5)
        val btn3 : Button = findViewById(R.id.button6)



        btn1.setOnClickListener {
            Toast.makeText(this,"첫번째 버튼 클릭됨!",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this,"두번째 버튼 클릭됨!",Toast.LENGTH_SHORT).show()
        }


        btn3.setOnClickListener {
            Toast.makeText(this,"세번째 버튼 클릭됨!",Toast.LENGTH_SHORT).show()
        }

    }
}
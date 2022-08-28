package com.example.linearlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout)

       val btn1 : Button = findViewById(R.id.goRelativity)
       val btn2 : Button = findViewById(R.id.goFrameActivity)
       val btn3 : Button = findViewById(R.id.goConstActivity)

       btn1.setOnClickListener {
           val intent = Intent(this,RelativeActivity::class.java)
           startActivity(intent)
       }


        btn2.setOnClickListener {
            val intent = Intent(this,FrameActivity::class.java)
            startActivity(intent)
        }



        btn3.setOnClickListener {
            Toast.makeText(this,"이 버튼은 직접 구현해보세요!",Toast.LENGTH_SHORT).show()
            //이곳에 ConstraintLayout Activity으로 이동할 수 있는 코드를 작성해보세요!
            /**
             * 정답
             * val intent = Intent(this,ConstraintActivity::class.java)
             * startActivity(intent)
             * */
        }

    }
}
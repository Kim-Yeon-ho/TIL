package com.example.androidlifectycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var ischeck : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("태그","최초 실행")

        val btn1 : Button = findViewById(R.id.button)
        val tv1 : TextView = findViewById(R.id.textView)

        btn1.setOnClickListener {

            if(ischeck){
                tv1.text = "isCheck : false!!"
                ischeck = false
            }else{
                tv1.text = "isCheck : true!!"
                ischeck = true
            }


        }

    }


    override fun onStart() {
        super.onStart()
        Log.i("태그","화면 실행됨")
        //매우 빠르게 진행된다.
    }

    override fun onResume() {
        super.onResume()
        Log.i("태그","화면 재개됨")
        //홈 -> 앱으로 다시 돌아오면 출력된다.
        Toast.makeText(this,"재개됨",Toast.LENGTH_SHORT).show()
        //화면으로 사용자가 다시 복귀 했을때 이벤트를 처리할 수 있다.
    }


    override fun onPause() {
        super.onPause()
        Log.i("태그","사용자가 화면 떠남")
        // 앱 -> 홈으로 이동시 출력된다.
    }

    override fun onStop() {
        super.onStop()
        Log.i("태그","앱 종료 감지")
        //앱이 종료되는 것을 감지할 경우 출력된다.
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i("태그","소멸됨")
        // 앱이 종료될 경우 출력된다.
    }
}
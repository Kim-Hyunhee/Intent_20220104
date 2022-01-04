package com.nepplus.intent_20220104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMessage.setOnClickListener {

            // 입력한 내용을 추출
            val inputMessage = edtMessage.text.toString()

            // 메기지 보기 화면으로 이동
            val myIntent = Intent (this, ViewMessageActivity::class.java)

            // myIntent에 추가 정보 담기 (여러 개의 데이터 추가도 가능)
            myIntent.putExtra("message",inputMessage)
            // myIntent.pueExtra()

            startActivity(myIntent)

        }

        btnMoveToOther.setOnClickListener {

            // Intent로 다른 화면으로 이동해보자
            val myIntent = Intent( this, OtherActivity::class.java )
            startActivity(myIntent)

        }
    }
}
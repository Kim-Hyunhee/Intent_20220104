package com.nepplus.intent_20220104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturnToMain.setOnClickListener {

            //val myIntent = Intent(this, MainActivity::class.java)
            //startActivity(myIntent)

            // 이전으로 복귀 : 현재 화면을 종료
            finish()

        }
    }
}
package com.example.medicare_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        val sign = findViewById<TextView>(R.id.signin)
        sign.setOnClickListener{
            val intent = Intent(this,firstPage::class.java)
            startActivity(intent)
        }
    }
}
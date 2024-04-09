package com.example.a2_3isp920_mongush_gevorkyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }
    fun registerActivity(view: View) {
        val registerIntent = Intent(this, Register::class.java)
        startActivity(registerIntent)
    }

    fun Login(view: View) {
        val loginIntent = Intent(this, Login::class.java)
        startActivity(loginIntent)
    }
}
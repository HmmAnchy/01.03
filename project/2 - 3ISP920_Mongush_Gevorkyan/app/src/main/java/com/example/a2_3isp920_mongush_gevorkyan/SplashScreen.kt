package com.example.a2_3isp920_mongush_gevorkyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {startActivity(Intent(applicationContext,MainActivity::class.java))},
            3000)
    }
}
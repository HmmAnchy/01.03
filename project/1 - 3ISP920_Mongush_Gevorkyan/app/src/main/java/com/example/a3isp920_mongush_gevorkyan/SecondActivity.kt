package com.example.a3isp920_mongush_gevorkyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber (){
        val count: Int = intent.getIntExtra(TOTAL_COUNT, 0)
        val random: Random = Random(0)
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textview_random.text = Integer.toString(randomInt)
    }
}
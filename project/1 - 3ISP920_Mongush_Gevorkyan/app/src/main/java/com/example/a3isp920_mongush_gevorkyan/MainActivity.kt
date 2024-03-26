package com.example.a3isp920_mongush_gevorkyan

import android.content.Intent
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById(textView)
    }

    fun toastMe (view: View) {
        val myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT)
        myToast.show()
        textView = findViewById(R.id.textView)
    }

    private lateinit var textView: TextView

    fun countMe (view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString();
    }
    fun randomMe (view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        startActivity(randomIntent)
        val countString: String = textView.text.toString()
        val count: Int = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }
}
package com.example.galinho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newAlarmButton = findViewById<Button>(R.id.btn_new_alarm)
        newAlarmButton.setOnClickListener {
            val intent = Intent(this, NewAlarmActivity::class.java)
            startActivity(intent)
        }
    }
}
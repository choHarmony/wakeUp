package com.example.heywakeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class set_alarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_alarm)

        val alarmDaybtn = findViewById<Button>(R.id.alarmDaybtn)
        alarmDaybtn.setOnClickListener {
            val intent = Intent(this, set_day::class.java)
            startActivity(intent)
        }

        val alarmTypebtn = findViewById<Button>(R.id.alarmTypebtn)
        alarmTypebtn.setOnClickListener{
            //val intent = Intent(this, )
            startActivity(intent)
        }

        val addAlarmbtn = findViewById<Button>(R.id.addAlarmbtn)
        addAlarmbtn.setOnClickListener{
            //val intent = Intent(this,)
            startActivity(intent)
        }


    }



}
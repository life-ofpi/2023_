package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            Toast.makeText(applicationContext,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
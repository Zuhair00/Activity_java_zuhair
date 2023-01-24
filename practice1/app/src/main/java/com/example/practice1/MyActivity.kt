package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity", "onCreate")
        setContentView(R.layout.main)
    }
}
package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MyStateChangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyStateChangeActivity","onCreate()")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("MyStateChangeActivity","onRestoreInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyStateChangeActivity","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyStateChangeActivity","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity","onDestroy")
    }
}
package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LOGCAT", "Entra al método onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.i("LOGCAT", "Entra al método onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LOGCAT", "Entra al método onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("LOGCAT", "Entra al método onPause")

    }
}


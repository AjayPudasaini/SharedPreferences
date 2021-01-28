package com.ajay.sharepreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        this is not completed


        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            startActivity(Intent(this@MainActivity, Login::class.java))
            finish()
        }
    }
}
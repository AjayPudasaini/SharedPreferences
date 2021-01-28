package com.ajay.sharepreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dashboard : AppCompatActivity() {
    private lateinit var btnHasPermission:Button
    private lateinit var btnSharePref:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        btnHasPermission = findViewById(R.id.btnRunTimePermission)
        btnSharePref = findViewById(R.id.btnSharePref)

        btnHasPermission.setOnClickListener {
            startActivity(Intent(this, PermissionActivity::class.java))
        }
        
        btnSharePref.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}
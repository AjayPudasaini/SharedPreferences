package com.ajay.sharepreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var btnGetData:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnGetData = findViewById(R.id.btnGetData)

        btnLogin.setOnClickListener {
            saveSharePref()
        }

        btnGetData.setOnClickListener {
            getSharedPref()
        }


    }

    private fun saveSharePref()
    {
        val username = etUsername.text.toString()
        val password = etPassword.text.toString()

        val sharePref = getSharedPreferences("MyPref", Context.MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putString("username", username)
        editor.putString("password", password)

        editor.apply()

        Toast.makeText(this@Login, "username and password saved", Toast.LENGTH_SHORT).show()
    }


    private fun getSharedPref() {
        val sharedPref = getSharedPreferences("MyPref", Context.MODE_PRIVATE)
        val username = sharedPref.getString("username", "")
        val password = sharedPref.getString("password", "")
        Toast.makeText(this, "Username: $username add password: $password", Toast.LENGTH_SHORT).show()
    }

}
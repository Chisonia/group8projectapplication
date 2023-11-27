package com.myfirstapp.groupprojectapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signInButton: com.google.android.material.button.MaterialButton= findViewById(R.id.signIn)
        signInButton.setOnClickListener {
            val s = Intent(this, SignInActivity2::class.java)
            startActivity(s)
        }
        val registerButton: com.google.android.material.button.MaterialButton = findViewById(R.id.register)
        registerButton.setOnClickListener {
            val r = Intent( this, RegisterActivity::class.java)
            startActivity(r)
        }
    }
}
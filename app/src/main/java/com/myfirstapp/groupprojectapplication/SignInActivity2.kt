package com.myfirstapp.groupprojectapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class SignInActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)
        val forgotButton: Button = findViewById(R.id.forgot)
        forgotButton.setOnClickListener {
            val f = Intent(this, ForgotPassActivity::class.java)
            startActivity(f)
        }
        val registerNowButton: com.google.android.material.button.MaterialButton = findViewById(R.id.register)
        registerNowButton.setOnClickListener {
            val reg = Intent(this, RegisterActivity::class.java)
            startActivity(reg)
        }
        val signInButton: com.google.android.material.button.MaterialButton = findViewById(R.id.sign)
        val emailInput: EditText = findViewById(R.id.email)
        val userNameInput: EditText = findViewById(R.id.email)
        val userPhoneInput: EditText = findViewById(R.id.email)
        val userPassInput: EditText = findViewById(R.id.pass)
        signInButton.setOnClickListener {
            val userEmailEntered: String = emailInput.text.toString()
            val userNameEntered: String = userNameInput.text.toString()
            val userPhoneEntered: String = userPhoneInput.text.toString()
            val userPassEntered: String = userPassInput.text.toString()
            var message = "Please enter email address or phone number or username and password"
            if(userEmailEntered.isEmpty() && userNameEntered.isEmpty() && userPhoneEntered.isEmpty() || userPassEntered.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentSignIn), message, Snackbar.LENGTH_LONG).show()
            }else{
                val si = Intent( this, HomeActivity::class.java)
                startActivity(si)
            }
        }
    }
}
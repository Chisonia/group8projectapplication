package com.myfirstapp.groupprojectapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class ForgotPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        val resetButton: com.google.android.material.button.MaterialButton = findViewById(R.id.reset)
        val emailInput: EditText = findViewById(R.id.email)
        resetButton.setOnClickListener {
            val userEmailEntered: String = emailInput.text.toString()
            var message = "";
            if(userEmailEntered.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentForgot),"Please enter email address",Snackbar.LENGTH_LONG).show()
            }else{
                val re = Intent( this, ResetPassWordActivity::class.java)
                startActivity(re)
            }
        }
        val goBackButton: Button = findViewById(R.id.bax)
        goBackButton.setOnClickListener {
            val b = Intent(this, SignInActivity2::class.java)
            startActivity(b)
        }
    }
}
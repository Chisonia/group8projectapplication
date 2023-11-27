package com.myfirstapp.groupprojectapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.myfirstapp.groupprojectapplication.R.id.parentReset

class ResetPassWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass_word)
        Snackbar.make(
            findViewById(parentReset),
            "A reset code has been sent to your email address",
            Snackbar.LENGTH_LONG
        ).show()
        val resetButton: com.google.android.material.button.MaterialButton =
            findViewById(R.id.reset)
        resetButton.setOnClickListener {
            val enterCodeInput: EditText = findViewById(R.id.code)
            val enterNewPassInput: EditText = findViewById(R.id.newPass)
            val reTypeInput: EditText = findViewById(R.id.reTypePass)
            val userCodeEnter: String = enterCodeInput.text.toString()
            val userNewPassEnter: String = enterNewPassInput.text.toString()
            val reTypePassEnter: String = reTypeInput.text.toString()
            var message = "You need to enter code and new password and retype password"
            if (userCodeEnter.isEmpty() || userNewPassEnter.isEmpty() || reTypePassEnter.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentReset), message, Snackbar.LENGTH_LONG).show()
            } else {
                val reset = Intent(this, SignInActivity2::class.java)
                startActivity(reset)
            }
            val backButton: Button = findViewById(R.id.goBack1)
            backButton.setOnClickListener {
                val go = Intent(this, SignInActivity2::class.java)
                startActivity(go)
            }
        }
    }
}
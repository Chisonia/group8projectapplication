package com.myfirstapp.groupprojectapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.myfirstapp.groupprojectapplication.R.layout.activity_register

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_register)
        val signUpButton: com.google.android.material.button.MaterialButton = findViewById(R.id.signUp)
        val emailInput: EditText = findViewById(R.id.email)
        val userNameInput: EditText = findViewById(R.id.name)
        val userPhoneInput: EditText = findViewById(R.id.phone)
        val userPassInput: EditText = findViewById(R.id.passWod)
        val businessNameInput: EditText = findViewById(R.id.business)
        signUpButton.setOnClickListener {
            val userEmailEntered: String = emailInput.text.toString()
            val userNameEntered: String = userNameInput.text.toString()
            val userPhoneEntered: String = userPhoneInput.text.toString()
            val userBusinessEntered: String = businessNameInput.text.toString()
            val userPassEntered: String = userPassInput.text.toString()
            val message = "Please enter name and business name and phone number and email address  and password"
            if(userEmailEntered.isEmpty() || userNameEntered.isEmpty() || userPhoneEntered.isEmpty() || userBusinessEntered.isEmpty() || userPassEntered.isEmpty()) {
                Snackbar.make(findViewById(R.id.parentRegister), message, Snackbar.LENGTH_LONG).show()
            }else{
                val si = Intent( this, SignInActivity2::class.java)
                startActivity(si)
            }
        }
        val signNButton: Button = findViewById(R.id.on)
        signNButton.setOnClickListener {
            val sup = Intent( this, SignInActivity2::class.java)
            startActivity(sup)
        }
    }
}
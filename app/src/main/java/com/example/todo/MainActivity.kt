package com.example.todo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val editTextName: EditText = findViewById(R.id.editTextText)
        val editTextPassword: EditText = findViewById(R.id.editTextTextPassword)
        val buttonSubmit: Button = findViewById(R.id.button)
        val textForgotPassword: TextView = findViewById(R.id.forgotpassword)
        val textSignUp: TextView = findViewById(R.id.textView_signup)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val password = editTextPassword.text.toString()
            if (name.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Welcome, $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both name and password", Toast.LENGTH_SHORT).show()
            }
        }

        textForgotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }

        textSignUp.setOnClickListener {
            Toast.makeText(this, "Sign Up clicked", Toast.LENGTH_SHORT).show()
        }
    }
}

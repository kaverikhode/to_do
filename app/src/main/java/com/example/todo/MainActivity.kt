package com.example.todo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var submitButton: Button
    private lateinit var welcomeText: TextView
    private lateinit var forgotPasswordText: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        nameEditText = findViewById(R.id.editTextText)
        passwordEditText = findViewById(R.id.editTextTextPassword)
        submitButton = findViewById(R.id.button)
        welcomeText = findViewById(R.id.main)
        forgotPasswordText = findViewById(R.id.forgotpassword)
        imageView = findViewById(R.id.imageView)

        // Handle Submit button click
        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (name.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Hello $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both name and password.", Toast.LENGTH_SHORT).show()
            }
        }

        // Optionally handle Forgot Password click
        forgotPasswordText.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}
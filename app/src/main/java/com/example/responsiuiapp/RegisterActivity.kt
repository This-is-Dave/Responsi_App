package com.example.responsiuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
    }

    fun back(view: View) {
        val intent = android.content.Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun register(view: View) {
        val intent = android.content.Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
package com.example.responsiuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
    }

    fun login(view: View) {
        val intent = android.content.Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    fun fPassword(view: View) {
        val intent = android.content.Intent(this, RecoveryActivity::class.java)
        startActivity(intent)
    }

    fun register(view: View) {
        val intent = android.content.Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}
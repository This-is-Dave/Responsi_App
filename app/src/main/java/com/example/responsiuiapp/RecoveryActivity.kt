package com.example.responsiuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)
        supportActionBar?.hide()
    }

    fun back(view: View) {
        val intent = android.content.Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun sendEmail(view: View) {
        val intent = android.content.Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
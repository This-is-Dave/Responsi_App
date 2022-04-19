package com.example.stenli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.responsiuiapp.Fragment.HistoryFragment
import com.example.responsiuiapp.Fragment.HomeFragment
import com.example.responsiuiapp.Fragment.PaymentFragment
import com.example.responsiuiapp.Fragment.SettingFragment
import com.example.responsiuiapp.R

class HomeActivity2 : AppCompatActivity() {

    private lateinit var btnBulan1: ImageView
    private lateinit var btnDD2 : ImageView
    private lateinit var btnBatas3 : ImageView
    private lateinit var btnNabung4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home);
        supportActionBar?.hide()

        btnBulan1 = findViewById(R.id.btn_home)
        btnDD2 = findViewById(R.id.btn_payment)
        btnBatas3 = findViewById(R.id.btn_history)
        btnNabung4 = findViewById(R.id.btn_setting)

        btnBulan1.setOnClickListener{
            loadFragment(HomeFragment())
        }

        btnDD2.setOnClickListener{
            loadFragment(PaymentFragment())
        }

        btnBatas3.setOnClickListener{
            loadFragment(HistoryFragment())
        }

        btnNabung4.setOnClickListener{
            loadFragment(SettingFragment())
        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}
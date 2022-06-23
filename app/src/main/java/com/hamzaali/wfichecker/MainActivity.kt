package com.hamzaali.wfichecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hamzaali.wifichecker.HWifiChecker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,HWifiChecker.hasInternetConnected(this).toString(),Toast.LENGTH_SHORT).show()

    }
}
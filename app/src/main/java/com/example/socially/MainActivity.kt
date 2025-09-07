package com.example.socially

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Start with page 1 (splash screen)
        val intent = Intent(this, NavigationActivity::class.java)
        intent.putExtra("page", 1)
        startActivity(intent)
        finish()
    }
}
package com.example.android_palette_publicmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_palette_public_mobile.Sydney

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(Sydney.suburbs)
    }
}
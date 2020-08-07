package com.sukhralia.recipescope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sukhralia.recipescope.classification.ClassifierActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppSharedPreferences.init(this)
        startActivity(Intent(this, ClassifierActivity::class.java))
    }
}
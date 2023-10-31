package com.example.hw6_3mon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw6_3mon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_fragment, FirstFragment()).commit()
    }
}
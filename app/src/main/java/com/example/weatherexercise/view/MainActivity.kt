package com.example.weatherexercise.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherexercise.R
import com.example.weatherexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
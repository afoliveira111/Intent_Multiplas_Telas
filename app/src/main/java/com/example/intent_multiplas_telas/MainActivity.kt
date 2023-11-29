package com.example.intent_multiplas_telas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_multiplas_telas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
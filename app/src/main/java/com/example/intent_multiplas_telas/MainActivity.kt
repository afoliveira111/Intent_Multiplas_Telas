package com.example.intent_multiplas_telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_multiplas_telas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonIr.setOnClickListener {
            //val i = Intent(this, ProfileActivity::class.java)
            //startActivity(i)

            startActivity(Intent(this, ProfileActivity::class.java))

        }

    }
}
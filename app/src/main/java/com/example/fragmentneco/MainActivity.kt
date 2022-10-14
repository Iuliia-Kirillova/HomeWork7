package com.example.fragmentneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentneco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonF2.setOnClickListener {
            supportFragmentManager
                .beginTransaction().replace(R.id.place_holder, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction().replace(R.id.place_holder, BlankFragment.newInstance())
            .commit()
    }
}
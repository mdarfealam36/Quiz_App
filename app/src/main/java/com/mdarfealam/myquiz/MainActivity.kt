package com.mdarfealam.myquiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mdarfealam.myquiz.databinding.ActivityMainBinding

/**
 * Created by - Android Rider.
 * Website - www.androidrider.com
 * Youtube - Android Rider
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playQuizHomeBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}
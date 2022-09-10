package com.example.androidfundamentals.fundamentalActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import com.example.androidfundamentals.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra("name")
        val age=intent.getIntExtra("age",0)
        val country=intent.getStringExtra("country")

         binding.name.text=name
        binding.age.text= age.toString()
        binding.country.text=country

    }
}


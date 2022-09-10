package com.example.androidfundamentals.fundamentalActivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import com.example.androidfundamentals.databinding.ActivityIntentPassBinding

class IntentPassActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntentPassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIntentPassBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener{
            val name=binding.name.text.toString()
            val age=binding.age.text.toString().toInt()
            val country=binding.country.text.toString()

            Intent(this,SecondActivity::class.java).also{
                it.putExtra("name",name)
                it.putExtra("age",age)
                it.putExtra("country",country)
                startActivity(it)
        }
        }
    }
}
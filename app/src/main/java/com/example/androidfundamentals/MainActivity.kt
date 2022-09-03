package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidfundamentals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.order.setOnClickListener{

         if (binding.button1.text==null ||binding.button2.text==null||binding.button3.text==null){
             Toast.makeText(this,"Please select any one option",Toast.LENGTH_SHORT).show()
         }
            if (binding.checkBox1.text==null){


            }


        }
    }
}
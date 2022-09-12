package com.example.androidfundamentals.fundamentalActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.androidfundamentals.R
import com.example.androidfundamentals.adapters.VIewPagerAdapter
import com.example.androidfundamentals.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image= listOf<Int>(
            R.drawable.yes,
            R.drawable.yes,
            R.drawable.yes,
            R.drawable.yes,
            R.drawable.yes,
            R.drawable.yes

        )
        val adapter=VIewPagerAdapter(image)
        binding.pager.adapter=adapter

        binding.pager.orientation=ViewPager2.ORIENTATION_VERTICAL
        binding.pager.beginFakeDrag()
        binding.pager.fakeDragBy(-10f)
    }
}
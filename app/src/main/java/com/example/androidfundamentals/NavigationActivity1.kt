package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.androidfundamentals.databinding.ActivityNavigation1Binding

class NavigationActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityNavigation1Binding
      var toggle: ActionBarDrawerToggle?=null
     val drawerLayout: DrawerLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNavigation1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)

        drawerLayout?.addDrawerListener(toggle!!)
       toggle!!.syncState()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.drawer.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home->Toast.makeText(this,"Home is selected",Toast.LENGTH_SHORT).show()
                R.id.policy->Toast.makeText(this,"Policy is selected",Toast.LENGTH_SHORT).show()
                R.id.setting->Toast.makeText(this,"Setting is selected",Toast.LENGTH_SHORT).show()
            }
           true
        }




    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle?.onOptionsItemSelected(item) == true){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
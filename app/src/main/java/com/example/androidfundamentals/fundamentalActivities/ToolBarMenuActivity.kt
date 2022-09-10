package com.example.androidfundamentals.fundamentalActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.androidfundamentals.R

class ToolBarMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.contact->Toast.makeText(this,"Contact selected",Toast.LENGTH_SHORT).show()
            R.id.home->Toast.makeText(this,"Home selected",Toast.LENGTH_SHORT).show()
            R.id.details->Toast.makeText(this,"Details is selected",Toast.LENGTH_SHORT).show()
            R.id.feedback->Toast.makeText(this,"Feedback is selected",Toast.LENGTH_SHORT).show()
            R.id.close->finish()
        }
        return true
    }
}
package com.example.androidfundamentals.fundamentalActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidfundamentals.R
import com.example.androidfundamentals.databinding.ActivityDialogBoxBinding
import com.example.androidfundamentals.databinding.ActivityMainBinding

class DialogBoxActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDialogBoxBinding
    private lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDialogBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog=AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setIcon(R.drawable.ic_launcher_foreground)
            .setMessage("Do you want to add your contact in phone...")
            .setPositiveButton("Yes"){_,_->

                Toast.makeText(this,"Successfully Inserted",Toast.LENGTH_SHORT).show()
            }

            .setNegativeButton("No"){
                _,_->
                Toast.makeText(this,"Successfully canceled",Toast.LENGTH_SHORT).show()
                dialog.dismiss()

            }.create()

        binding.button1.setOnClickListener{
            dialog.show()
        }

        val options=arrayOf("Item1","Item2","Item3")
        val selectBox=AlertDialog.Builder(this)
            .setTitle("Add Items")
            .setIcon(R.drawable.ic_launcher_foreground)
            .setSingleChoiceItems(options,0){ e,i->
                Toast.makeText(this,"Successfully selected item:${options[i]}",Toast.LENGTH_SHORT).show()
            }

            .setPositiveButton("Yes"){
                _,_->
                Toast.makeText(this,"Successfully selected",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){
                _,_->
                Toast.makeText(this,"Successfully canceled",Toast.LENGTH_SHORT).show()
            }.create()

        binding.button2.setOnClickListener{
            selectBox.show()
        }




        val multiItems=AlertDialog.Builder(this)
            .setTitle("MultiItems")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){
                _,i,isChecked->

                if (isChecked){
                    Toast.makeText(this,"Successfully checked:${options[i]}",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Successfully unchecked:${options[i]}",Toast.LENGTH_SHORT).show()
                }

            }
            .setPositiveButton("Yes"){
                    _,_->
                Toast.makeText(this,"Successfully multiItem selected",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){
                    _,_->
                Toast.makeText(this,"Successfully multiItem canceled",Toast.LENGTH_SHORT).show()
            }.create()

        binding.button3.setOnClickListener{
            multiItems.show()
        }


    }
}
package com.example.goal

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
//import android.view.LayoutInflater
import com.example.goal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSetAim.setOnClickListener {
            val option = arrayOf("SDE", "SE", "Mobile Development")
            val builder1 = AlertDialog.Builder(this)

            builder1.setTitle("What you want to be?")

            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialogInterface, which ->
                Toast.makeText(this,"Your Aim is ${option[which]}",Toast.LENGTH_SHORT).show()
            })

            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //action after submit
            })

            builder1.setNegativeButton("Not Now",DialogInterface.OnClickListener { dialogInterface, i ->
                //action after not submit
            })
            builder1.show()
        }

        binding.btnSelectLang.setOnClickListener {
            val option = arrayOf("Kotlin", "C++", "Java", "Python")

            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What Programming Language do you want to learn?")

            builder2.setMultiChoiceItems(option,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this,"You Select ${option[i]}",Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                //action after submit
            })

            builder2.setNegativeButton("Not Now",DialogInterface.OnClickListener { dialogInterface, i ->
                //action after not submit
            })
            builder2.show()
        }

        binding.btnSummit.setOnClickListener {
            val builder3 = AlertDialog.Builder(this)

            builder3.setTitle("Are you sure?")
            builder3.setMessage("Do you want submit your Answer?")

            builder3.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this,"Successfully Submitted",Toast.LENGTH_SHORT).show()
                finish()
            })

            builder3.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.show()
        }

    }
}
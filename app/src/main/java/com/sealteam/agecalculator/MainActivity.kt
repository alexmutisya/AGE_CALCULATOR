package com.sealteam.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickevent(view: View) {
        val dob=findViewById<EditText>(R.id.year)
        val showage=findViewById<TextView>(R.id.age)
        val userdob:String=dob.text.toString()
        if(userdob.toInt()==0) {
            showage.text = "invalid input"
            return
        }
        val year:Int= Calendar.getInstance().get(Calendar.YEAR)
        val myage=year-userdob.toInt()
        showage.text="your age is $myage"
        }



    }

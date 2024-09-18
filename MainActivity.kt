package com.example.thmiss

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a= findViewById<RadioGroup>(R.id.rg)
        var b = findViewById<CheckBox>(R.id.checkBox)
        var c= findViewById<CheckBox>(R.id.checkBox2)
        var d= findViewById<CheckBox>(R.id.checkBox3)
        var e= findViewById<Button>(R.id.button2)
        e.setOnClickListener {
            var f= a.checkedRadioButtonId
            var g = when(f){
                R.id.radioButton-> "Medium"
                R.id.radioButton2-> "Large"
                R.id.radioButton4-> "Small"
                else ->""
            }
            var h = mutableListOf<String>()
            if (b.isChecked)h.add("cheese")
            if (c.isChecked)h.add("corn")
            if (d.isChecked)h.add("mushroom")
            Toast.makeText(this,"your selected size of pizza is "+g +"and toppings are "+h,Toast.LENGTH_LONG).show()
        }
    }
}
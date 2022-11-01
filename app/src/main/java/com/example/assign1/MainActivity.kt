package com.example.assign1

import android.R.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.count)
        var flag ="Please Select"
        val spinnerVal: Spinner = findViewById(R.id.CoffeeSpinner)
        var options = arrayOf("One", "Two", "Three", "Four", "Five")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, layout.simple_list_item_1, options)

        button.setOnClickListener{
            if(flag =="one")
                price.text = multiply(1).toString()
            else if(flag =="two")
                price.text = multiply(2).toString()
            else if(flag =="three")
                price.text = multiply(3).toString()
            else if(flag =="four")
                price.text = multiply(4).toString()
            else
                price.text = multiply(5).toString()
        }


        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
    }
}
public fun multiply(a: Int): Int {
    return a*3
}
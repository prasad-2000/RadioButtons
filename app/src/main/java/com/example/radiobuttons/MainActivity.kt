package com.example.radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radiogroup.setOnCheckedChangeListener { radiogroup,i->
            var rb = findViewById<RadioButton>(i)
            if(rb!=null){
                Toast.makeText(this,rb.text.toString(),Toast.LENGTH_SHORT).show()
            }
        }
        clearbtn.setOnClickListener {
            radiogroup.clearCheck()
            textView.setText("Choose an Option")
        }
    }
}
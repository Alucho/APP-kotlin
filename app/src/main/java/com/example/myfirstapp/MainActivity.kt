package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import java.sql.Timestamp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.btCliqueAqui) as Button
        btn.setOnClickListener {

            val tpnumero = System.currentTimeMillis()
            val tpstring = tpnumero.toString()
            val laststr  = tpstring.last().toString()
            val root = findViewById(R.id.bgBase) as View
            val color = when(laststr) {
                "1" -> getResources().getColor(R.color.black)
                "2" -> getResources().getColor(R.color.blue)
                "3" -> getResources().getColor(R.color.green)
                "4" -> getResources().getColor(R.color.pink)
                "5" -> getResources().getColor(R.color.red)
                "6" -> getResources().getColor(R.color.purple)
                "7" -> getResources().getColor(R.color.yellow)
                "8"-> getResources().getColor(R.color.grey)
                "9" -> getResources().getColor(R.color.lilac)
                else -> getResources().getColor(R.color.white)
            }
            root.setBackgroundColor(color)
            //Toast.makeText(this@MainActivity, tpstring+" "+laststr, Toast.LENGTH_SHORT).show()
        }

    }
}
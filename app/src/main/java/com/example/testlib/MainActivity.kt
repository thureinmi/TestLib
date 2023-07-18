package com.example.testlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculation.calculate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultPlus: Int = calculate.plus(20,10)
        val resultMinus: Int = calculate.minus(15,5)
        val btnPlus = R.id.btnPlus
        val btnMinus = R.id.btnMinus

        findViewById<View>(btnPlus)?.setOnClickListener {
            Toast.makeText(this, resultPlus.toString(), Toast.LENGTH_LONG).show()
        }
        findViewById<View>(btnMinus)?.setOnClickListener {
            Toast.makeText(this, resultMinus.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
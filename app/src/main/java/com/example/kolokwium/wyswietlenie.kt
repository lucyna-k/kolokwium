package com.example.kolokwium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class wyswietlenie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wyswietlenie)

        var w=findViewById<TextView>(R.id.BMI)
        var BMI=getIntent().getStringExtra("BMI")
        w.setText(BMI.toString())

    }


}
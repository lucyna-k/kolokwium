package com.example.kolokwium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private var przycisk: Button?=null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        przycisk=findViewById(R.id.button)

        val text_wzrost=findViewById<TextView>(R.id.wzrost)
        val wzrost=text_wzrost.text.toString()
        val text_waga=findViewById<TextView>(R.id.waga)
        val waga=text_waga.text.toString()

        przycisk?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
            var wynik = oblicz(waga.toDouble(), wzrost.toDouble())
            akt_next(wynik)
            }
        })

    }


    private fun akt_next(wynik:Double){
        val intent= Intent(this,wyswietlenie::class.java)
        intent.putExtra("BMI",wynik)
        startActivity(intent)

    }
    private fun oblicz(waga: Double, wzrost:Double): Double{
        var BMI=waga/(wzrost*wzrost)
        return BMI
    }
}
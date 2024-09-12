package com.example.temp_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botonC : Button = findViewById(R.id.Celsius)
        val botonK : Button = findViewById(R.id.Kelvin)
        val botonF : Button = findViewById(R.id.Farenheit)
        val valorGrados : EditText = findViewById(R.id.valorGrados)
        val convC : TextView = findViewById(R.id.resultado1)
        val convK : TextView = findViewById(R.id.resultado2)
        val convF : TextView = findViewById(R.id.resultado3)

        val input = valorGrados.text.toString()

        botonC.setOnClickListener{
            if(input.isNotEmpty()){
                val valorX = input.toDouble()
                val resultK = valorX + 273.15
                val resultF = ((9*valorX)/5) + 32
                convF.text = "$resultF"
                convK.text = "$resultK"
                convC.text = "$valorX"

            }else if(input.isEmpty()){
                convF.text = "Error"
                convK.text = "Error"
                convC.text = "Error"
            }
        }
        botonF.setOnClickListener{

        }
        }
    }

package com.example.calculadorakt

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.calculadorakt.R
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private var nro1: EditText? = null
    private var nro2: EditText? = null
    private var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nro1 = findViewById<View>(R.id.nro1) as EditText
        nro2 = findViewById<View>(R.id.nro2) as EditText
        resultado = findViewById<View>(R.id.resultado) as TextView
    }

    fun sumar(view: View?) {
        val valor1 = nro1!!.text.toString()
        val valor2 = nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val suma = n1 + n2
        val resu = suma.toString()
        resultado!!.text = resu
        Log.d("suma", "boton suma presionado")
    }

    fun restar(view: View?) {
        val valor1 = nro1!!.text.toString()
        val valor2 = nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val rest = n1 - n2
        val resu = rest.toString()
        resultado!!.text = resu
        Log.d("resta", "boton resta presionado")
    }

    fun multiplicar(view: View?) {
        val valor1 = nro1!!.text.toString()
        val valor2 = nro2!!.text.toString()
        val n1 = valor1.toInt()
        val n2 = valor2.toInt()
        val mult = n1 * n2
        val resu = mult.toString()
        resultado!!.text = resu
        Log.d("multiplicación", "boton multiplicación presionado")
    }

    fun dividir(view: View?) {
        val decimalFormat = DecimalFormat("#0.##")
        val valor1 = nro1!!.text.toString()
        val valor2 = nro2!!.text.toString()
        val n1 = valor1.toFloat()
        val n2 = valor2.toFloat()
        val div = n1 / n2
        val resu = decimalFormat.format(div.toDouble())
        resultado!!.text = resu
        Log.d("division", "boton division presionado")
    }
}
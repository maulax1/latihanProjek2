package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        var inputSisi = findViewById<EditText>(R.id.ed_sisi)
        var btnHitung= findViewById<Button>(R.id.btn_Hitung)
        var hasil = findViewById<TextView>(R.id.tv_hasil)
        var spinner = findViewById<Spinner>(R.id.spinner)
        val objekPilihan  = arrayOf("Volume", "Keliling","Luas Permukaan")

        btnHitung.setOnClickListener(){
            val sisi: Double = inputSisi.text.toString().toDouble()
            val hitung = sisi * sisi
            hasil.text = hitung.toString()

            //spinner.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, objekPilihan)




            }

        }
    }
}

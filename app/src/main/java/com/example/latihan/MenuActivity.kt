package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        var btnRelative = findViewById(R.id.btn_relative) as Button
        var btnLinear = findViewById(R.id.btn_linear) as Button
        var btnScroll = findViewById(R.id.btn_scrooll) as Button
        var btnFrame = findViewById(R.id.btn_frame) as Button
        var btnConstraint = findViewById(R.id.btn_contraint) as Button
        var btnForm = findViewById(R.id.btn_form) as Button

        btnRelative.setOnClickListener{
            val pindah = Intent(this, relativeLayout::class.java)
            startActivity(pindah)
        }
        btnLinear.setOnClickListener{
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
        btnScroll.setOnClickListener{
            val pindah = Intent(this, ScroollActivity::class.java)
            startActivity(pindah)
        }
        btnFrame.setOnClickListener{
            val pindah = Intent(this, FrameActivity::class.java)
            startActivity(pindah)
        }
        btnConstraint.setOnClickListener{
            val pindah = Intent(this, ConstraintActivity::class.java)
            startActivity(pindah)
        }
        btnForm.setOnClickListener{
            val pindah = Intent(this, FormActivity::class.java)
            startActivity(pindah)
        }

    }
}

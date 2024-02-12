package com.fazihaikhlaq.i200473

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

@Suppress("DEPRECATION")
class Mentors : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentors)



        findViewById<LinearLayout>(R.id.search_btn).setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }
    }
}
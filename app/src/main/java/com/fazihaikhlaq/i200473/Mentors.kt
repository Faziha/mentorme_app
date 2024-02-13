package com.fazihaikhlaq.i200473

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

@Suppress("DEPRECATION")
class Mentors : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentors)



        findViewById<LinearLayout>(R.id.search_btn).setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }

        findViewById<CardView>(R.id.cooper_card1).setOnClickListener{
            startActivity(Intent(this,Book_Session_Activity::class.java))
        }
    }
}
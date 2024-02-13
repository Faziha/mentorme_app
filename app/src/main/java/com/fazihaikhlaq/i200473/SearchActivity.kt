package com.fazihaikhlaq.i200473

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.LinearLayout

@Suppress("DEPRECATION")
class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        findViewById<LinearLayout>(R.id.home_btn).setOnClickListener{
            startActivity(Intent(this, Mentors::class.java))
        }

        Handler().postDelayed({
            val intent = Intent(this, Search_Results_Activity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}

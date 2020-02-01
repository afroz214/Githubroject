package com.smartherd.githubproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //my first github project
        //my first mistake on github
        btn_next.setOnClickListener {
            startActivity(Intent(this@MainActivity, secondactivtiy::class.java))
        }

    }
}

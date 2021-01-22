package com.e.aplikasihiwar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LayoutUtamaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_utama)

        val btnpindahback2: ImageView = findViewById(R.id.btn_back2)
        btnpindahback2.setOnClickListener(this)

        val btnpindahchapter1: ImageView = findViewById(R.id.btn_chapter12)
        btnpindahchapter1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back2 -> {
                val move_to_mainactivity =
                    Intent(this@LayoutUtamaActivity, MainActivity::class.java)
                startActivity(move_to_mainactivity)

            }

            R.id.btn_chapter12 -> {
                val move_to_chapter1activity =
                    Intent(this@LayoutUtamaActivity, Chapter1Activity::class.java)
                startActivity(move_to_chapter1activity)
            }
        }
    }
}
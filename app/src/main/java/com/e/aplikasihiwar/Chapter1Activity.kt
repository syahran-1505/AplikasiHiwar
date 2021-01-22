package com.e.aplikasihiwar

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Chapter1Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter1)

        val btnpindahchapter1: ImageView = findViewById(R.id.btn_backchapter1)
        btnpindahchapter1.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.btn_audiochapter1)
        keluarsuara.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_backchapter1 ->{
                val move_to_LayoutUtama= Intent(this@Chapter1Activity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)
            }
            R.id.btn_audiochapter1 -> {
                val putaraudio = MediaPlayer.create(this, R.raw.audio_chapter1)
                putaraudio.start()
            }
        }

    }
}
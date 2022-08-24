package com.example.miniproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Cupang_view : AppCompatActivity() {
    private var title: String = "Cupang Detail"
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        setActionBarTitle(title)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cupang_view)
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val tvDataImg: ImageView= findViewById(R.id.ImageView)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val image = intent.getIntExtra(EXTRA_IMAGE,R.drawable.cupang_crown_tail)
        val text = "Name : $name, \nDetail : $detail"
        tvDataImg.setImageResource( image)
        tvDataReceived.text = text


    }
}
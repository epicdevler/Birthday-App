package com.example.birthdaywisher

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            
        val btn: Button = findViewById(R.id.button)
        val layoutBackground: androidx.constraintlayout.widget.ConstraintLayout =
            findViewById(R.id.parentLayout)
        val image: ImageView = findViewById(R.id.imageView)

        btn.setOnClickListener {
            layoutBackground.setBackgroundColor(R.color.purple_200)
            image.visibility = View.VISIBLE
        }

    }
}
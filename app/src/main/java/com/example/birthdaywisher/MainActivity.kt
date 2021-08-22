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


//        Initialize UI Views in Buttons
        val btn: Button = findViewById(R.id.button)
        val layoutBackground: androidx.constraintlayout.widget.ConstraintLayout =
            findViewById(R.id.parentLayout)
        val image: ImageView = findViewById(R.id.imageView)


//        Handle Click Listener fo UI Button:
        btn.setOnClickListener {

//            Change background color
            layoutBackground.setBackgroundColor(R.color.purple_200)

//            Set image visibility to Visible
            image.visibility = View.VISIBLE
        }

    }
}
package com.example.kotlinsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class ActivityDetailItem : AppCompatActivity() {

    lateinit var judul : TextView
    lateinit var desc : TextView
    lateinit var carouselView: CarouselView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)

        var baru : Item = intent.getSerializableExtra("item") as Item

        judul.text = baru.judul
        desc.text = baru.detail

        carouselView = findViewById(R.id.carouselView)
        carouselView.setPageCount(4)

        val imageListener =
            ImageListener { position, imageView -> imageView.setImageResource(baru.image[position]) }

    }

}

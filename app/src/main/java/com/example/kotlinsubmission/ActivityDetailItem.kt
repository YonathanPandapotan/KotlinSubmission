package com.example.kotlinsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class ActivityDetailItem : AppCompatActivity() {

    lateinit var judul : TextView
    lateinit var shipClass : TextView
    lateinit var desc : TextView
    lateinit var carouselView: CarouselView

    lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)

        var baru : Item = intent.getSerializableExtra("item") as Item
        val imageListener =
            ImageListener { position, imageView -> imageView.setImageResource(baru.image[position]) }

        judul = findViewById(R.id.judul)
        shipClass = findViewById(R.id.shipClass)
        desc = findViewById(R.id.desc)

        judul.text = baru.judul
        shipClass.text = baru.shipClass
        desc.text = baru.detail

        carouselView = findViewById(R.id.carouselView)
        carouselView.setPageCount(baru.image.size)
        carouselView.setImageListener(imageListener)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setTitle("Detail Item")

    }

}

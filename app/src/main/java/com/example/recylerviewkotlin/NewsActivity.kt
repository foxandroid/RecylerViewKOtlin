package com.example.recylerviewkotlin

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val headingNews : TextView = findViewById(R.id.heading)
        val mainNews : TextView = findViewById(R.id.news)
        val imageNews : ImageView = findViewById(R.id.image_heading)

        val bundle : Bundle?= intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("news")

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)

    }
}
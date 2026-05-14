package com.example.homework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var list: ArrayList<AppModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        list = ArrayList()

        list.add(AppModel("Instegram", "social", "4.5 ★", R.drawable.img1))
        list.add(AppModel("Whatsapp", "social", "4.6 ★", R.drawable.whatsapp))
        list.add(AppModel("Twitter", "social", "4.3 ★", R.drawable.img3))
        list.add(AppModel("Snapchat", "social", "4.5 ★", R.drawable.img10))
        list.add(AppModel("Facebook", "social", "4.5 ★", R.drawable.face))
        list.add(AppModel("Youtube", "social", "4.6 ★", R.drawable.img13))
        list.add(AppModel("Vibar", "social", "4.3 ★", R.drawable.vib))
        list.add(AppModel("Spotify", "social", "4.5 ★", R.drawable.spo))
        list.add(AppModel("Tiktok", "social", "4.5 ★", R.drawable.tik))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AppAdapter(list)
    }
}
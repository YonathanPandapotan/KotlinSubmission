package com.example.kotlinsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var item : RecyclerView
    private var list : ArrayList<Item> = arrayListOf()
    private lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        item = findViewById(R.id.recycler)

        list.addAll(ItemData.data)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun showRecyclerList(){
        item.layoutManager = LinearLayoutManager(this)

        val itemAdapter = ItemAdapter(list)
        item.adapter = itemAdapter

        itemAdapter.setOnItemClickCallback(object : ItemAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Item) {
                Log.d("Here it is", "It Worked")
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(hero: Item) {
        Toast.makeText(this, "Kamu memilih " + hero.judul, Toast.LENGTH_SHORT).show()
    }
}

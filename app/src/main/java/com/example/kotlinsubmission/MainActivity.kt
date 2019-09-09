package com.example.kotlinsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var item : RecyclerView
    private var list : ArrayList<Item> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item = findViewById(R.id.recycler)

        list.addAll(ItemData.data)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.profile -> {
                startActivity(Intent (this@MainActivity, ActivityMyProfile::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun showRecyclerList(){
        item.layoutManager = LinearLayoutManager(this)

        val itemAdapter = ItemAdapter(list)
        item.adapter = itemAdapter

        itemAdapter.setOnItemClickCallback(object : ItemAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Item) {
                selectItem(data)
            }
        })
    }

    private fun selectItem(item: Item) {
        var baru : Intent = Intent(this@MainActivity, ActivityDetailItem::class.java)
        baru.putExtra("item", item)
        startActivity(baru)
    }
}

package com.example.kotlinsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val listItem: ArrayList<Item>) : RecyclerView.Adapter<ItemAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (judul, shipClass, desc, image) = listItem[position]

        holder.judul.text = judul
        holder.desc.text = desc
        holder.img.setImageResource(image[0])

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listItem[holder.adapterPosition])}
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var judul : TextView = itemView.findViewById(R.id.judul)
        var desc : TextView = itemView.findViewById(R.id.desc)
        var img : ImageView = itemView.findViewById(R.id.gambar)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Item)
    }

}
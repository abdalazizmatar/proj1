package com.example.homework1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(private val list: ArrayList<AppModel>) :
    RecyclerView.Adapter<AppAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.imgApp)
        val name = itemView.findViewById<TextView>(R.id.txtName)
        val category = itemView.findViewById<TextView>(R.id.txtCategory)
        val rate = itemView.findViewById<TextView>(R.id.txtRate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_app, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.category.text = list[position].category
        holder.rate.text = list[position].rate
        holder.img.setImageResource(list[position].image)
    }
}
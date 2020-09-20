package com.keegansmith.ironharvestapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.keegansmith.ironharvestapp.model.Unit

class BasicAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val data = listOf(
        Unit("Gunner", "Shooty Shooty fella"),
        Unit("Kolokol", "Light armored mech that uses a rotary mechanism to launch grenades."),
        Unit("Field Gun", "Stationary manned cannon that is very effective against armor.")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.basic_list_item, parent, false)
        return BasicViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.unit_title).text = data[position].name
        holder.itemView.findViewById<TextView>(R.id.description).text = data[position].description

    }

    override fun getItemCount(): Int {
        return data.size
    }
}
package com.example.firstgame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_list.view.*

class CycleAdapter(val users: ArrayList<String>) : RecyclerView.Adapter<CycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.textView5.text = users[position]
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstname: TextView = itemView.findViewById(R.id.textView5)
    }

}





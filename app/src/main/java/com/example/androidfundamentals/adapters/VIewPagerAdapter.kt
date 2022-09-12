package com.example.androidfundamentals.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfundamentals.R

class VIewPagerAdapter(
    val list: List<Int>
): RecyclerView.Adapter<VIewPagerAdapter.ViewHolder>() {


    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.sample_viewpager,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val image=list[position]
        holder.itemView.findViewById<ImageView>(R.id.image).setImageResource(image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
package com.sulnae.sulnae.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.sulnae.sulnae.R
import com.sulnae.sulnae.`object`.Alcohol
import com.sulnae.sulnae.network.InitListData


class AlcoholAdapter(context: Context) : RecyclerView.Adapter<AlcoholAdapter.AlcoholViewHolder>() {
    val alcoholList: ArrayList<Alcohol> = InitListData().alcoholList
    val context = context

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): AlcoholViewHolder {
        val viewGroup = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_alcohol, parent, false)

        return AlcoholViewHolder(viewGroup)
    }

    fun getItem(position: Int): Alcohol = alcoholList[position]

    override fun getItemCount(): Int = alcoholList.size

    override fun onBindViewHolder(holder: AlcoholViewHolder, position: Int) {
        holder.img.setImageResource(R.drawable.ic_search_24dp)
        holder.title.text = alcoholList[position].name
        Glide.with(context).load(alcoholList[position].image).into(holder.img)

        val capacity = "도수 " + alcoholList[position].drinkCapacity + "˚"
        holder.capacity.text = capacity
        holder.explanation.text = alcoholList[position].intro
        holder.ratingBar.numStars = alcoholList[position].rating.toInt()
    }

    class AlcoholViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.iv_item)
        val title: TextView = itemView.findViewById(R.id.tv_title)
        val ratingBar: RatingBar = itemView.findViewById(R.id.rating)
        val capacity: TextView = itemView.findViewById(R.id.tv_capacity)
        val explanation: TextView = itemView.findViewById(R.id.tv_explain)
    }
}
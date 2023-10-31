package com.example.hw6_3mon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw6_3mon.databinding.ItemFoodsBinding

class FoodsAdapter(private var foodsList: List<Foods>): RecyclerView.Adapter<FoodsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFoodsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = foodsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(foodsList[position])
    }

    inner class ViewHolder(private val binding: ItemFoodsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(foods: Foods){
            binding.apply {
                foods.apply {
                    tvNameFoods.text = name
                    imgFoods.loadImage(img)
                }
            }
        }
    }
}
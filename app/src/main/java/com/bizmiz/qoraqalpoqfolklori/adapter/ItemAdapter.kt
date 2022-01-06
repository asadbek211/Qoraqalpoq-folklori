package com.gita.allomalar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bizmiz.milliyoyinlar.utils.imageList
import com.bizmiz.qoraqalpoqfolklori.databinding.DostonlarItemBinding

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {
    var onclick: (position: Int) -> Unit = {}
    fun setOnclickListener(onclick: (position: Int) -> Unit) {
        this.onclick = onclick
    }

    inner class MyViewHolder(private val binding: DostonlarItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun populateModel(position: Int) {
            binding.itemImg.setImageResource(imageList[position])
            binding.itemCard.setOnClickListener {
                onclick.invoke(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemBinding =
            DostonlarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.populateModel(position)
    }

    override fun getItemCount(): Int = imageList.size
}
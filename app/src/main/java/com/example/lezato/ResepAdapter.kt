package com.example.lezato

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ResepAdapter (val resepItemList : List<ResepData>, val clickListener: (ResepData) -> Unit):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(resep: ResepData, clickListener: (ResepData) -> Unit) {

            itemView.textView.text = resep.jenis_makanan.toString()
            itemView.textView2.text = resep.asal_makanan.toString()
            itemView.imageView.setImageResource(resep.foto_makanan)

            itemView.setOnClickListener { clickListener(resep) }
        }
    }
}



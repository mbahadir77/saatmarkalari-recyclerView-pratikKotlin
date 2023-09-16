package com.yildirimtechnologies.saatmarkalarpratikkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yildirimtechnologies.saatmarkalarpratikkotlin.databinding.RecyclerRowBinding

class saatAdaptor (val saatbilgisilist : ArrayList<saatbilgisi>) : RecyclerView.Adapter <saatAdaptor.saatlerHolder>() {
    class saatlerHolder (val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): saatlerHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return saatlerHolder(binding)
    }

    override fun getItemCount(): Int {
        return saatbilgisilist.size
    }

    override fun onBindViewHolder(holder: saatlerHolder, position: Int) {
        holder.binding.recyclerViewTextView.text=saatbilgisilist.get(position).isim
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetayActivity::class.java)
            intent.putExtra("saatbilgisi",saatbilgisilist.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }
}
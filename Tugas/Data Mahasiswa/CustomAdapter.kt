package com.example.tugasmandiri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val mhsList: ArrayList<Mahasiswa>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mhs: Mahasiswa=mhsList[position]
        holder?.textViewName?.text = mhs.name
        holder?.textViewNumber?.text = mhs.number
        holder?.textViewAddress?.text = mhs.address

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return  ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return mhsList.size
    }

    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewNumber = itemView.findViewById(R.id.textViewNumber) as TextView
        val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
    }
}
package com.example.supermarketlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val dbHelper: DBHelper) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemName: TextView = view.findViewById(R.id.item_name)
        val itemQuantity: TextView = view.findViewById(R.id.item_quantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dbHelper.get ITEM(position)
        holder.itemName.text = item.name
        holder.itemQuantity.text = "quantity: ${item.quantity}"
    }

    override fun getItemCount(): Int {
        return dbHelper.getCount()
    }
}

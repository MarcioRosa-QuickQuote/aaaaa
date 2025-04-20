package com.example.suquermercado

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SuperMarketList(private val context: Context) : android.widget.ListView.Adapter<ListView>() {

    private val items = arrayOf("Laranja", "Maçã", "Banana", "Melão")

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        val textView = view.findViewById<TextView>(R.id.text_view)
        textView.text = items[position]
        return view
    }
}

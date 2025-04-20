package com.example.supermercado.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import com.example.supermercado.Models.SupermercadoModel

class SupermercadoAdapter(private val supermercados: List<SupermercadoModel>) : BaseAdapter()
{
    override fun getCount(): Int {
        return supermercados.size
    }

    override fun getItem(position: Int): Any {
        return supermercados[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflator = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.item_supermercado, null)

        val nome = view.findViewById<TextView>(R.id.nome)
        val descricao = view.findViewById<TextView>(R.id.descricao)

        val supermercado = supermercados[position]
        nome.text = supermercado.nome
        descricao.text = supermercado.descricao

        return view
    }
}

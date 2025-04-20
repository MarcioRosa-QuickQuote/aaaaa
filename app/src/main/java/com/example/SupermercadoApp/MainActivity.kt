package com.example.SupermercadoApp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val listaProdutos = listOf("Leite", "Arroz", "Feijão")
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaProdutos)

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

        }
    }
}

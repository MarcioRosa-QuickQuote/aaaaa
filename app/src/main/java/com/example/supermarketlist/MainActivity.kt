package com.example.supermarketlist
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {
 private lateinit var listView: ListView
 private var list: MutableList<String> = mutableListOf()

 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  listView = findViewById(R.id.listView)
  loadData()
 }

 private fun loadData() {
  list.add("apple")
  list.add("banana")
  list.add("grapes")
  val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
  listView.adapter = adapter
 }
}
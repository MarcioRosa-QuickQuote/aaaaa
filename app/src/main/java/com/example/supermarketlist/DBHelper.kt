package com.example.supermarketlist

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "supermarket_list.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_DB_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS ${TABLE_NAME}")
        onCreate(db)
    }

    private const val CREATE_DB_TABLE = "CREATE TABLE ${TABLE_NAME} (id INTEGER PRIMARY KEY, name TEXT, quantity INTEGER)"
    private const val TABLE_NAME = "supermarket_items"
}

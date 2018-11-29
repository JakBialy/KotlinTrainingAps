package com.jakub.emojidictionary2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter: EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = GridLayoutManager(this,3)
        recyclerView.layoutManager = layoutManager

        adapter = EmojiAdapter(arrayListOf("\uD83D\uDE00","\uD83C\uDF54","\uD83E\uDD11"))
        recyclerView.adapter = adapter
    }
}

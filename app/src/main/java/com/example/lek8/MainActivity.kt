package com.example.lek8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> = listOf("Boris", "Max")
        val userRecView: RecyclerView = findViewById(R.id.user_rec_view)
        userRecView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        userRecView.adapter = UserAdapter(userNameList)



    }
}
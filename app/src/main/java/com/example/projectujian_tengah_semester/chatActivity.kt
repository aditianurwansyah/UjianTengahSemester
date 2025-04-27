package com.example.projectujian_tengah_semester

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ListView

class chatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat2)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val chatListView = findViewById<ListView>(R.id.chatListView)

        val chatData = listOf(
            Chat("Andi", "Halo bro!"),
            Chat("Budi", "Apa kabar?"),
            Chat("Citra", "Ayo jalan-jalan!"),
            Chat("Doni", "Setuju!")
        )

        val chatAdapter = ChatAdapter(this, chatData)
        chatListView.adapter = chatAdapter
    }
}

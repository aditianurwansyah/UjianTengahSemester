package com.example.projectujian_tengah_semester

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ChatAdapter(private val context: Context, private val chatList: List<Chat>) : BaseAdapter() {

    override fun getCount(): Int = chatList.size

    override fun getItem(position: Int): Any = chatList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_chat, parent, false)

        val senderTextView = view.findViewById<TextView>(R.id.senderTextView)
        val messageTextView = view.findViewById<TextView>(R.id.messageTextView)

        val chat = chatList[position]
        senderTextView.text = chat.sender
        messageTextView.text = chat.message

        return view
    }
}
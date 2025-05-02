package com.nicossteam.piratelive

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.leanback.widget.Presenter

class CardPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val context = parent.context
        val textView = TextView(context).apply {
            layoutParams = ViewGroup.LayoutParams(320, 180)
            setBackgroundColor(Color.BLACK)
            setTextColor(Color.WHITE)
            textSize = 20f
            setPadding(24, 24, 24, 24)
        }
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
        val textView = viewHolder.view as TextView
        textView.text = item.toString()
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {
        // No-op
    }
} 

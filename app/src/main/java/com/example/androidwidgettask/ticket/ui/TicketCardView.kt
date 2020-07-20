package com.example.androidwidgettask.ticket.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.androidwidgettask.R
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import kotlinx.android.synthetic.main.tickets.view.*


class TicketCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.tickets, this, true)
    }

    fun setUpTicketData(data: TicketData) {
        ticket_date.text = data.date
        ticket_title.text = data.title
    }
}
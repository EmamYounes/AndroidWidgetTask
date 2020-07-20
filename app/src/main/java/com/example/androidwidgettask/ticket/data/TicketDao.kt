package com.example.androidwidgettask.ticket.data
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class TicketDao {

    private var date = ""
    private var title = ""
    private val ticketLiveData = MutableLiveData<TicketData>()

    init {
        ticketLiveData.value = TicketData(date, title)
    }

    fun setTicketData(data: TicketData) {
        this.date = data.date
        this.title = data.title
        ticketLiveData.value = TicketData(date, title)
    }

    fun getTicketData() = ticketLiveData as LiveData<*>

}
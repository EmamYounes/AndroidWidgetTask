package com.example.androidwidgettask.ticket.ui

import androidx.lifecycle.ViewModel
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.ticket.repo.TicketRepo

class TicketViewModel(private val ticketRepo: TicketRepo) : ViewModel() {

    fun setTicketData(data: TicketData) {
        ticketRepo.setTicketData(data)
    }

    fun getTicketData() = ticketRepo.getTicketData()

}
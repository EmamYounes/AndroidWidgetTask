package com.example.androidwidgettask.ticket.repo

import com.example.androidwidgettask.ticket.data.TicketDao
import com.example.androidwidgettask.ticket.data.TicketData

class TicketRepo private constructor(private val ticketDao: TicketDao) {

    fun setTicketData(data: TicketData) {
        ticketDao.setTicketData(data)
    }

    fun getTicketData() = ticketDao.getTicketData()

    companion object {
        @Volatile
        private var instance: TicketRepo? = null

        fun getInstance(ticketDao: TicketDao) =
            instance ?: synchronized(lock = this) {
                instance ?: TicketRepo(ticketDao).also {
                    instance = it
                }
            }
    }
}
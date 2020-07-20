package com.example.androidwidgettask.ticket.data

class TicketDataBase private constructor() {
    var ticketDao = TicketDao()
        private set

    companion object {
        @Volatile
        private var instance: TicketDataBase? = null

        fun getInstance() = instance ?: synchronized(lock = this) {
            instance ?: TicketDataBase().also {
                instance = it
            }
        }
    }
}
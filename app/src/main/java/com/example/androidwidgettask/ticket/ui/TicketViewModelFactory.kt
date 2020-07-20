package com.example.androidwidgettask.ticket.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidwidgettask.ticket.repo.TicketRepo

class TicketViewModelFactory(private val ticketRepo: TicketRepo) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TicketViewModel(ticketRepo) as T
    }
}
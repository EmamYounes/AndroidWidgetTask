package com.example.androidwidgettask.upcoming_event.ui

import UpcomingEventRepo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UpcomingEventViewModelFactory(private val upcomingEventRepo: UpcomingEventRepo) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UpcomingEventViewModel(upcomingEventRepo) as T
    }
}
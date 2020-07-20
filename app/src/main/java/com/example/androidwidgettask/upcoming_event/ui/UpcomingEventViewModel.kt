package com.example.androidwidgettask.upcoming_event.ui

import UpcomingEventRepo
import androidx.lifecycle.ViewModel
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData

class UpcomingEventViewModel(private val upcomingEventRepo: UpcomingEventRepo) : ViewModel() {

    fun setUpcomingData(data: UpcomingEventData) {
        upcomingEventRepo.setUpcomingData(data)
    }

    fun getUpcomingData() = upcomingEventRepo.getUpcomingData()

}
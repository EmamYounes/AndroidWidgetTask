package com.example.androidwidgettask.upcoming_event.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class UpcomingEventDao {

    private var date = ""
    private var title = ""
    private val upcomingEventLiveData = MutableLiveData<UpcomingEventData>()

    init {
        upcomingEventLiveData.value = UpcomingEventData(date, title)
    }

    fun setUpcomingData(data: UpcomingEventData) {
        this.date = data.date
        this.title = data.title
        upcomingEventLiveData.value = UpcomingEventData(date, title)
    }

    fun getUpcomingData() = upcomingEventLiveData as LiveData<*>

}
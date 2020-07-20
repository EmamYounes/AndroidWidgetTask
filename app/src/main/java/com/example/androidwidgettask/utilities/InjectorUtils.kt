package com.example.androidwidgettask.utilities

import UpcomingEventRepo
import com.example.androidwidgettask.my_requests.data.MyRequestDataBase
import com.example.androidwidgettask.my_requests.repo.MyRequestRepo
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModelFactory
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventDataBase
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModelFactory

object InjectorUtils {
    fun providerMyRequestViewModelFactory(): MyRequestViewModelFactory {
        val myRequestRepo = MyRequestRepo.getInstance(MyRequestDataBase.getInstance().myRequestDao)
        return MyRequestViewModelFactory(myRequestRepo)
    }

    fun providerUpcomingEventViewModelFactory(): UpcomingEventViewModelFactory {
        val upcomingEventRepo =
            UpcomingEventRepo.getInstance(UpcomingEventDataBase.getInstance().upcomingEventDao)
        return UpcomingEventViewModelFactory(upcomingEventRepo)
    }
}
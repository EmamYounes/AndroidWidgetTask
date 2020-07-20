package com.example.androidwidgettask.upcoming_event.data

class UpcomingEventDataBase private constructor() {
    var upcomingEventDao = UpcomingEventDao()
        private set

    companion object {
        @Volatile
        private var instance: UpcomingEventDataBase? = null

        fun getInstance() = instance ?: synchronized(lock = this) {
            instance ?: UpcomingEventDataBase().also {
                instance = it
            }
        }
    }
}
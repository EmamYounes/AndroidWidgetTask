package com.example.androidwidgettask.weather.model


class WeatherDataBase private constructor() {
    var weatherDao = WeatherDao()
        private set

    companion object {
        @Volatile
        private var instance: WeatherDataBase? = null

        fun getInstance() = instance ?: synchronized(lock = this) {
            instance ?: WeatherDataBase().also {
                instance = it
            }
        }
    }
}
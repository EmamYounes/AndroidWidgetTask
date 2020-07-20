package com.example.androidwidgettask.weather.repo

import com.example.androidwidgettask.weather.model.WeatherDao
import com.example.androidwidgettask.weather.model.WeatherDataModel

class WeatherRepo private constructor(private val weatherDao: WeatherDao) {
    fun addWeatherData(weatherDataModel: WeatherDataModel) {
        weatherDao.addWeatherData(weatherDataModel)
    }

    fun getWeatherData() = weatherDao.getWeatherData()

    companion object {
        @Volatile
        private var instance: WeatherRepo? = null

        fun getInstance(weatherDao: WeatherDao) =
            instance ?: synchronized(lock = this) {
                instance ?: WeatherRepo(weatherDao).also {
                    instance = it
                }
            }
    }
}
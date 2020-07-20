package com.example.androidwidgettask.weather.ui


import androidx.lifecycle.ViewModel
import com.example.androidwidgettask.weather.model.WeatherDataModel
import com.example.androidwidgettask.weather.repo.WeatherRepo

class WeatherViewModel(private val weatherRepo: WeatherRepo) : ViewModel() {

    fun addWeatherData(weatherDataModel: WeatherDataModel) {
        weatherRepo.addWeatherData(weatherDataModel)
    }

    fun getWeatherData() = weatherRepo.getWeatherData()

}
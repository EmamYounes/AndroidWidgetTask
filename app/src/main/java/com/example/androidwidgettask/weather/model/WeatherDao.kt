package com.example.androidwidgettask.weather.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class WeatherDao {


    private var weatherList = listOf<WeatherListModel>()
    private var weatherData = WeatherData("", "", "")

    private val weatherLiveData = MutableLiveData<WeatherDataModel>()

    init {
        weatherLiveData.value = WeatherDataModel(weatherData, weatherList)
    }

    fun addWeatherData(weatherDataModel: WeatherDataModel) {
        weatherList = weatherDataModel.weatherListModel
        this.weatherData = weatherDataModel.weatherData
        weatherLiveData.value = WeatherDataModel(this.weatherData, weatherList)
    }

    fun getWeatherData() = weatherLiveData as LiveData<*>

}
package com.example.androidwidgettask.weather.ui


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidwidgettask.weather.repo.WeatherRepo

class WeatherViewModelFactory(private val weatherRepo: WeatherRepo) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WeatherViewModel(weatherRepo) as T
    }
}
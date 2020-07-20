package com.example.androidwidgettask.weather.model

import com.example.androidwidgettask.R

data class WeatherListModel(val time: String, val degree: String) {

    fun getResourceItem(timeNumber: Int): Int {
        return when (timeNumber) {
            5 -> R.drawable.ic_sun_svgrepo_com
            6 -> R.drawable.ic_cloud
            7 -> R.drawable.ic_cloud_moon
            8 -> R.drawable.ic_cloud_thunder_moon
            9 -> R.drawable.ic_cloud_thunder_moon_rain
            else ->
                R.drawable.ic_sun_svgrepo_com
        }
    }
}
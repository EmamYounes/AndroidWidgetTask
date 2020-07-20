package com.example.androidwidgettask.weather.ui

import android.content.Context
import android.util.AttributeSet
import android.util.LayoutDirection
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidwidgettask.R
import com.example.androidwidgettask.weather.adapter.WeatherItemAdapter
import com.example.androidwidgettask.weather.model.WeatherData
import com.example.androidwidgettask.weather.model.WeatherListModel
import kotlinx.android.synthetic.main.weather.view.*


class WeatherListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    private lateinit var adapter: WeatherItemAdapter

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.weather, this, true)
    }

    fun addWeatherData(weatherData: WeatherData) {
        weather_day.text = weatherData.day
        weather_city.text = weatherData.city
        weather_state.text = weatherData.state
    }

    fun addWeatherList(list: List<WeatherListModel>) {
        weather_list_view.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        weather_list_view.adapter = WeatherItemAdapter(list, context)
    }
}
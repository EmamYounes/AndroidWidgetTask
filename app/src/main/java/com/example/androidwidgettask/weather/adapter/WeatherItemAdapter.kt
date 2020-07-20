package com.example.androidwidgettask.weather.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwidgettask.R
import com.example.androidwidgettask.weather.model.WeatherListModel
import kotlinx.android.synthetic.main.weather_item_card.view.*

class WeatherItemAdapter(val weatherList: List<WeatherListModel>, val context: Context) :
    RecyclerView.Adapter<WeatherItemAdapter.WeatherItemHolder>() {

    class WeatherItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(weatherModel: WeatherListModel) {
            itemView.weather_time.text = weatherModel.time
            itemView.weather_degree.text = weatherModel.degree
            itemView.weather_icon.setImageResource(weatherModel.getResourceItem(weatherModel.time.substring(0,1).toInt()))
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WeatherItemHolder {
        return WeatherItemHolder(
            LayoutInflater.from(context).inflate(
                R.layout.weather_item_card,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int = weatherList.size

    override fun onBindViewHolder(holder: WeatherItemHolder, position: Int) {
        val model: WeatherListModel = weatherList[position]
        holder.bind(model)
    }

}
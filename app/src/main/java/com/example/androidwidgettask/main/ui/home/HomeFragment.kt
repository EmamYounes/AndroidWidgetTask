package com.example.androidwidgettask.main.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidwidgettask.R
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModel
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.ticket.ui.TicketViewModel
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModel
import com.example.androidwidgettask.utilities.AddLocalData
import com.example.androidwidgettask.utilities.InjectorUtils
import com.example.androidwidgettask.weather.model.WeatherDataModel
import com.example.androidwidgettask.weather.ui.WeatherViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }
    init {
        initializeMyRequestUi()
        initializeUpcomingEvent()
        initializeTicket()
        initializeWeather()
    }

    private fun initializeMyRequestUi() {
        val factory = InjectorUtils.providerMyRequestViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(MyRequestViewModel::class.java)
        AddLocalData().addPendingNumberLocalData(viewModel)
        viewModel.getPendingRequestNumber().observe(this, Observer { number ->
            myRequestCardView.setPendingRequestNumber(number.toString())
        })

    }

    private fun initializeUpcomingEvent() {
        val factory = InjectorUtils.providerUpcomingEventViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(UpcomingEventViewModel::class.java)
        AddLocalData().addUpcomingLocalData(viewModel)
        viewModel.getUpcomingData().observe(this, Observer { data ->
            upcomingEventCardView.setUpcomingData(data = data as UpcomingEventData)
        })

    }

    private fun initializeTicket() {
        val factory = InjectorUtils.providerTicketViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(TicketViewModel::class.java)
        AddLocalData().addTicketLocalData(viewModel)
        viewModel.getTicketData().observe(this, Observer { data ->
            ticketCardView.setUpTicketData(data = data as TicketData)
        })

    }


    private fun initializeWeather() {
        val factory = InjectorUtils.providerWeatherViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(WeatherViewModel::class.java)
        AddLocalData().addWeatherLocalData(viewModel)
        viewModel.getWeatherData().observe(this, Observer { data ->
            val weatherDataModel = data as WeatherDataModel
            weatherListView.addWeatherData(weatherData = weatherDataModel.weatherData)
            weatherListView.addWeatherList(list = weatherDataModel.weatherListModel)
        })

    }
}

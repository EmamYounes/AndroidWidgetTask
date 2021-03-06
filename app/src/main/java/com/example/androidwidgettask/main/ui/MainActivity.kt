package com.example.androidwidgettask.main.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidwidgettask.R
import com.example.androidwidgettask.bills.model.BillsDataModel
import com.example.androidwidgettask.bills.ui.BillsViewModel
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModel
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.ticket.ui.TicketViewModel
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModel
import com.example.androidwidgettask.utilities.AddLocalData
import com.example.androidwidgettask.utilities.InjectorUtils
import com.example.androidwidgettask.weather.model.WeatherDataModel
import com.example.androidwidgettask.weather.ui.WeatherViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        initializeMyRequestUi()
        initializeUpcomingEvent()
        initializeTicket()
        initializeWeather()
        initializeBills()
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

    private fun initializeBills() {
        val factory = InjectorUtils.providerBillsViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(BillsViewModel::class.java)
        AddLocalData().addBillsLocalData(viewModel)
        viewModel.getBillsData().observe(this, Observer { data ->
            val billsDataModel = data as BillsDataModel

            billsListView.addBillsData(billsData = billsDataModel.billsData)
            billsListView.addBillsList(list = billsDataModel.billsListModel)
        })

    }
}

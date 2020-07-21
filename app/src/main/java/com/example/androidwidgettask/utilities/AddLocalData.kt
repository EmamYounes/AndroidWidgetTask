package com.example.androidwidgettask.utilities

import com.example.androidwidgettask.bills.model.BillsData
import com.example.androidwidgettask.bills.model.BillsDataModel
import com.example.androidwidgettask.bills.model.BillsListModel
import com.example.androidwidgettask.bills.ui.BillsViewModel
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModel
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.ticket.ui.TicketViewModel
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModel
import com.example.androidwidgettask.weather.model.WeatherData
import com.example.androidwidgettask.weather.model.WeatherDataModel
import com.example.androidwidgettask.weather.model.WeatherListModel
import com.example.androidwidgettask.weather.ui.WeatherViewModel

class AddLocalData {
    fun addWeatherLocalData(viewModel: WeatherViewModel) {
        val weatherList = mutableListOf<WeatherListModel>()
        weatherList.add(WeatherListModel(time = "5 PM", degree = "22"))
        weatherList.add(WeatherListModel(time = "6 PM", degree = "23"))
        weatherList.add(WeatherListModel(time = "7 PM", degree = "24"))
        weatherList.add(WeatherListModel(time = "8 PM", degree = "25"))
        weatherList.add(WeatherListModel(time = "9 PM", degree = "26"))
        weatherList.add(WeatherListModel(time = "10 PM", degree = "22"))
        weatherList.add(WeatherListModel(time = "11 PM", degree = "22"))
        val weatherDataModel = WeatherDataModel(
            weatherData = WeatherData(
                day = "Friday",
                city = "Sharjah",
                state = "Mostly Clear"
            ),
            weatherListModel = weatherList
        )

        viewModel.addWeatherData(weatherDataModel)
    }

    fun addTicketLocalData(viewModel: TicketViewModel) {
        viewModel.setTicketData(
            TicketData(
                "Monday, 21 Oct 2020 - 3:00 PM",
                "Rainroom"
            )
        )
    }

    fun addUpcomingLocalData(viewModel: UpcomingEventViewModel) {
        viewModel.setUpcomingData(
            UpcomingEventData(
                "14 Sep - 18 Sep | 9:00 AM",
                "March Meeting 2020: Unravelling the Present"
            )
        )
    }

    fun addPendingNumberLocalData(viewModel: MyRequestViewModel) {
        viewModel.setPendingRequestNumber("12")
    }

    fun addBillsLocalData(viewModel: BillsViewModel) {
        val billsList = mutableListOf<BillsListModel>()
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        billsList.add(BillsListModel("SEWA Bill", "Due: 28 Jul 2020", "400 AED"))
        val billsDataModel = BillsDataModel(BillsData("1,200 AED", "950 AED"), billsList)
        viewModel.addBillsData(billsDataModel)
    }

}
package com.example.androidwidgettask.utilities

import UpcomingEventRepo
import com.example.androidwidgettask.bills.model.BillsDataBase
import com.example.androidwidgettask.bills.repo.BillsRepo
import com.example.androidwidgettask.bills.ui.BillsViewModelFactory
import com.example.androidwidgettask.my_requests.data.MyRequestDataBase
import com.example.androidwidgettask.my_requests.repo.MyRequestRepo
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModelFactory
import com.example.androidwidgettask.ticket.data.TicketDataBase
import com.example.androidwidgettask.ticket.repo.TicketRepo
import com.example.androidwidgettask.ticket.ui.TicketViewModelFactory
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventDataBase
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModelFactory
import com.example.androidwidgettask.weather.model.WeatherDataBase
import com.example.androidwidgettask.weather.repo.WeatherRepo
import com.example.androidwidgettask.weather.ui.WeatherViewModelFactory

object InjectorUtils {
    fun providerMyRequestViewModelFactory(): MyRequestViewModelFactory {
        val myRequestRepo = MyRequestRepo.getInstance(MyRequestDataBase.getInstance().myRequestDao)
        return MyRequestViewModelFactory(myRequestRepo)
    }

    fun providerUpcomingEventViewModelFactory(): UpcomingEventViewModelFactory {
        val upcomingEventRepo =
            UpcomingEventRepo.getInstance(UpcomingEventDataBase.getInstance().upcomingEventDao)
        return UpcomingEventViewModelFactory(upcomingEventRepo)
    }

    fun providerTicketViewModelFactory(): TicketViewModelFactory {
        val ticketRepo =
            TicketRepo.getInstance(TicketDataBase.getInstance().ticketDao)
        return TicketViewModelFactory(ticketRepo)
    }

    fun providerWeatherViewModelFactory(): WeatherViewModelFactory {
        val weatherRepo =
            WeatherRepo.getInstance(WeatherDataBase.getInstance().weatherDao)
        return WeatherViewModelFactory(weatherRepo)
    }

    fun providerBillsViewModelFactory(): BillsViewModelFactory {
        val billsRepo =
            BillsRepo.getInstance(BillsDataBase.getInstance().billsDao)
        return BillsViewModelFactory(billsRepo)
    }
}
package com.example.androidwidgettask.main.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidwidgettask.R
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModel
import com.example.androidwidgettask.ticket.data.TicketData
import com.example.androidwidgettask.ticket.ui.TicketViewModel
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import com.example.androidwidgettask.upcoming_event.ui.UpcomingEventViewModel
import com.example.androidwidgettask.utilities.InjectorUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeMyRequestUi()
        initializeUpcomingEvent()
        initializeTicket()
    }

    private fun initializeMyRequestUi() {
        val factory = InjectorUtils.providerMyRequestViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(MyRequestViewModel::class.java)
        viewModel.setPendingRequestNumber("12")
        viewModel.getPendingRequestNumber().observe(this, Observer { number ->
            myRequestCardView.setPendingRequestNumber(number.toString())
        })

    }

    private fun initializeUpcomingEvent() {
        val factory = InjectorUtils.providerUpcomingEventViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(UpcomingEventViewModel::class.java)
        viewModel.setUpcomingData(
            UpcomingEventData(
                "14 Sep - 18 Sep | 9:00 AM",
                "March Meeting 2020: Unravelling the Present"
            )
        )
        viewModel.getUpcomingData().observe(this, Observer { data ->
            upcomingEventCardView.setUpcomingData(data = data as UpcomingEventData)
        })

    }

    private fun initializeTicket() {
        val factory = InjectorUtils.providerTicketViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(TicketViewModel::class.java)
        viewModel.setTicketData(
            TicketData(
                "Monday, 21 Oct 2020 - 3:00 PM",
                "Rainroom"
            )
        )
        viewModel.getTicketData().observe(this, Observer { data ->
            ticketCardView.setUpTicketData(data = data as TicketData)
        })

    }
}

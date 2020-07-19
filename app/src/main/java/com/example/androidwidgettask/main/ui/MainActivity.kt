package com.example.androidwidgettask.main.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidwidgettask.R
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModel
import com.example.androidwidgettask.utilities.InjectorUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeMyRequestUi()
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
}

package com.example.androidwidgettask.my_requests.ui

import androidx.lifecycle.ViewModel
import com.example.androidwidgettask.my_requests.repo.MyRequestRepo

class MyRequestViewModel(private val myRequestRepo: MyRequestRepo) : ViewModel() {

    fun setPendingRequestNumber(pendingRequestNumber: String) {
        myRequestRepo.setPendingRequestNumber(pendingRequestNumber)
    }

    fun getPendingRequestNumber() = myRequestRepo.getPendingRequestNumber()

}
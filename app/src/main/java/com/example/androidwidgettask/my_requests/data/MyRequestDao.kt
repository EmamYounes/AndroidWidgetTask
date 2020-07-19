package com.example.androidwidgettask.my_requests.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyRequestDao {
    private var pendingRequestNumber = ""
    private val pendingRequestNumberLiveData = MutableLiveData<String>()

    init {
        pendingRequestNumberLiveData.value = pendingRequestNumber
    }

    fun setPendingRequestNumber(pendingRequestNumber: String) {
        this.pendingRequestNumber = pendingRequestNumber
        pendingRequestNumberLiveData.value = this.pendingRequestNumber
    }

    fun getPendingRequestNumber() = pendingRequestNumberLiveData as LiveData<*>

}
package com.example.androidwidgettask.utilities

import com.example.androidwidgettask.my_requests.data.MyRequestDataBase
import com.example.androidwidgettask.my_requests.repo.MyRequestRepo
import com.example.androidwidgettask.my_requests.ui.MyRequestViewModelFactory

object InjectorUtils {
    fun providerMyRequestViewModelFactory(): MyRequestViewModelFactory {
        val myRequestRepo=MyRequestRepo.getInstance(MyRequestDataBase.getInstance().myRequestDao)
        return  MyRequestViewModelFactory(myRequestRepo)
    }
}
package com.example.androidwidgettask.my_requests.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidwidgettask.my_requests.repo.MyRequestRepo

class MyRequestViewModelFactory(private val myRequestRepo: MyRequestRepo) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MyRequestViewModel(myRequestRepo) as T
    }
}
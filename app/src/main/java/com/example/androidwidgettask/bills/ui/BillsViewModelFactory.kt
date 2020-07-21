package com.example.androidwidgettask.bills.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidwidgettask.bills.repo.BillsRepo


class BillsViewModelFactory(private val billsRepo: BillsRepo) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BillsViewModel(billsRepo) as T
    }
}
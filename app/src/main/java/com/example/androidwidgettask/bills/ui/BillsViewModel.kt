package com.example.androidwidgettask.bills.ui

import androidx.lifecycle.ViewModel
import com.example.androidwidgettask.bills.model.BillsDataModel
import com.example.androidwidgettask.bills.repo.BillsRepo

class BillsViewModel(private val billsRepo: BillsRepo) : ViewModel() {

    fun addBillsData(billsDataModel: BillsDataModel) {
        billsRepo.addBillsData(billsDataModel)
    }

    fun getBillsData() = billsRepo.getBillsData()

}
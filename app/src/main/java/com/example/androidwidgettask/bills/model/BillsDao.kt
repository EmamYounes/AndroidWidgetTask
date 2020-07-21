package com.example.androidwidgettask.bills.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class BillsDao {
    private var billsList = listOf<BillsListModel>()
    private var billsData = BillsData("", "")

    private val billsLiveData = MutableLiveData<BillsDataModel>()

    init {
        billsLiveData.value = BillsDataModel(billsData, billsList)
    }

    fun addBillsData(billsDataModel: BillsDataModel) {
        billsList = billsDataModel.billsListModel
        this.billsData = billsDataModel.billsData
        billsLiveData.value = BillsDataModel(this.billsData, billsList)
    }

    fun getBillsData() = billsLiveData as LiveData<*>
}
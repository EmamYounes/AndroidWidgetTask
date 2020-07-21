package com.example.androidwidgettask.bills.repo

import com.example.androidwidgettask.bills.model.BillsDao
import com.example.androidwidgettask.bills.model.BillsDataModel


class BillsRepo private constructor(private val billsDao: BillsDao) {
    fun addBillsData(billsDataModel: BillsDataModel) {
        billsDao.addBillsData(billsDataModel)
    }

    fun getBillsData() = billsDao.getBillsData()

    companion object {
        @Volatile
        private var instance: BillsRepo? = null

        fun getInstance(billsDao: BillsDao) =
            instance ?: synchronized(lock = this) {
                instance ?: BillsRepo(billsDao).also {
                    instance = it
                }
            }
    }
}
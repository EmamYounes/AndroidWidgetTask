package com.example.androidwidgettask.bills.model

class BillsDataBase private constructor() {
    var billsDao = BillsDao()
        private set

    companion object {
        @Volatile
        private var instance: BillsDataBase? = null

        fun getInstance() = instance ?: synchronized(lock = this) {
            instance ?: BillsDataBase().also {
                instance = it
            }
        }
    }
}
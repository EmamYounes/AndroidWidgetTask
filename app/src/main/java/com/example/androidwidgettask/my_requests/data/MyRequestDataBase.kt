package com.example.androidwidgettask.my_requests.data

class MyRequestDataBase private constructor() {
    var myRequestDao = MyRequestDao()
        private set

    companion object {
        @Volatile
        private var instance: MyRequestDataBase? = null

        fun getInstance() = instance ?: synchronized(lock = this) {
            instance ?: MyRequestDataBase().also {
                instance = it
            }
        }
    }
}
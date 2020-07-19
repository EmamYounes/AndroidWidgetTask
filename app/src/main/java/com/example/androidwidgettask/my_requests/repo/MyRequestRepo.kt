package com.example.androidwidgettask.my_requests.repo

import com.example.androidwidgettask.my_requests.data.MyRequestDao

class MyRequestRepo private constructor(private val myRequestDao: MyRequestDao) {
    fun setPendingRequestNumber(pendingRequestNumber: String) {
        myRequestDao.setPendingRequestNumber(pendingRequestNumber)
    }
    fun getPendingRequestNumber() = myRequestDao.getPendingRequestNumber()

    companion object {
        @Volatile
        private var instance: MyRequestRepo? = null

        fun getInstance(myRequestDao: MyRequestDao) = instance ?: synchronized(lock = this) {
            instance ?: MyRequestRepo(myRequestDao).also {
                instance = it
            }
        }
    }
}
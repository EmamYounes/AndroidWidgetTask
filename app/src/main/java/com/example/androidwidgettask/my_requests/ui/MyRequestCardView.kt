package com.example.androidwidgettask.my_requests.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.androidwidgettask.R
import com.example.androidwidgettask.utilities.InjectorUtils
import kotlinx.android.synthetic.main.my_requests.view.*


class MyRequestCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.my_requests, this, true)
    }

    fun setPendingRequestNumber(pendingRequestNumber: String) {
        pending_request_number.text = pendingRequestNumber
    }
}
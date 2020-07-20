package com.example.androidwidgettask.upcoming_event.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.androidwidgettask.R
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData
import com.example.androidwidgettask.utilities.InjectorUtils
import kotlinx.android.synthetic.main.upcoming_event.view.*


class UpcomingEventCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.upcoming_event, this, true)
    }

    fun setUpcomingData(data: UpcomingEventData) {
        upcoming_event_date_up.text = data.date
        upcoming_event_date_down.text = data.date
        upcoming_event_title.text = data.title
    }
}
package com.example.androidwidgettask.bills.ui


import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidwidgettask.R
import com.example.androidwidgettask.bills.adapter.BillsAdapter
import com.example.androidwidgettask.bills.model.BillsData
import com.example.androidwidgettask.bills.model.BillsListModel
import kotlinx.android.synthetic.main.bills.view.*
import kotlinx.android.synthetic.main.weather.view.*


class BillsCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    private lateinit var adapter: BillsAdapter

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.bills, this, true)
    }

    fun addBillsData(billsData: BillsData) {
        total_bills.text = billsData.totalBills
        total_due.text = billsData.totalDue
    }

    fun addBillsList(list: List<BillsListModel>) {
        bills_list_view.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )
        bills_list_view.adapter = BillsAdapter(list, context)
    }
}
package com.example.androidwidgettask.bills.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwidgettask.R
import com.example.androidwidgettask.bills.model.BillsListModel
import kotlinx.android.synthetic.main.bills_item_card.view.*

class BillsAdapter(val billsList: List<BillsListModel>, val context: Context) :
    RecyclerView.Adapter<BillsAdapter.BillsHolder>() {

    class BillsHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(billsModel: BillsListModel) {
            itemView.bills_title.text = billsModel.billsName
            itemView.bills_date.text = billsModel.billsDate
            itemView.bills_amount.text = billsModel.billsAmount
        }
    }


    override fun getItemCount(): Int = billsList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BillsHolder {
        return BillsHolder(
            LayoutInflater.from(context).inflate(
                R.layout.bills_item_card,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BillsHolder, position: Int) {
        val model: BillsListModel = billsList[position]
        holder.bind(model)
    }

}
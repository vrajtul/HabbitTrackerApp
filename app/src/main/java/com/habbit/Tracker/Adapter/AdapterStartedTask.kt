package com.habbit.Tracker.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.habbit.Tracker.Model.ModelTask
import com.habbit.Tracker.databinding.ItemMyReminderBinding

class AdapterStartedTask : RecyclerView.Adapter<AdapterStartedTask.ViewHolder>() {

    lateinit var dataList: List<ModelTask>

    inner class ViewHolder(val binding: ItemMyReminderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemMyReminderBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(dataList[position]) {
                binding.txtTitle.text = this.title
                binding.txtTime.text = this.time

            }
        }
    }

    fun dataNotify(list: List<ModelTask>) {
        dataList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}

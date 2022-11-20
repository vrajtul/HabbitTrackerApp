package com.habbit.Tracker.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.habbit.Tracker.Activity.CreateTaskActivity
import com.habbit.Tracker.Model.ModelCategories
import com.habbit.Tracker.Model.ModelTask
import com.habbit.Tracker.R
import com.habbit.Tracker.databinding.ItemMyReminderBinding
import com.habbit.Tracker.databinding.ItemNewCategoriesBinding

class AdapterCategories : RecyclerView.Adapter<AdapterCategories.ViewHolder>() {

    lateinit var dataList: List<ModelCategories>
    lateinit var context : Context

    inner class ViewHolder(val binding: ItemNewCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val binding =
            ItemNewCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(dataList[position]) {
                binding.txtTitle.text = this.title
                binding.imgIcon.setImageResource(this.iconIdImg ?: R.drawable.ic_sleep_early)

                binding.linearItem.setOnClickListener {
                    context.startActivity(Intent(context, CreateTaskActivity::class.java))
                }
            }
        }
    }

    fun dataNotify(list: List<ModelCategories>) {
        dataList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}

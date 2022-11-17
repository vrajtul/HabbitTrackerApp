package com.habbit.Tracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.habbit.Tracker.Activity.SelectCategoryActivity
import com.habbit.Tracker.Adapter.AdapterStartedTask
import com.habbit.Tracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var listTask: List<ModelTask>
    private lateinit var adapterStartedTask: AdapterStartedTask

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterStartedTask = AdapterStartedTask()
        loadDataFromDB()

        binding.recyclerViewTaskStarted.setLayoutManager(LinearLayoutManager(this))
        binding.recyclerViewTaskStarted.adapter = adapterStartedTask

        binding.imgAddTask.setOnClickListener {
            startActivity(Intent(this, SelectCategoryActivity::class.java))
        }
    }

    private fun loadDataFromDB() {
        listTask = listOf(
            ModelTask("Sleep Early", "0/1h"),
            ModelTask("Exercise", "0/30m"),
            ModelTask("1 DSA Problem", "0/1h"),
            ModelTask("Read Book", "0/1"),
            ModelTask("Sleep Early", "0/1h"),
            ModelTask("Exercise", "0/30m"),
            ModelTask("1 DSA Problem", "0/1h"),
            ModelTask("Read Book", "0/1"),
            ModelTask("Sleep Early", "0/1h"),
            ModelTask("Exercise", "0/30m"),
            ModelTask("1 DSA Problem", "0/1h"),
            ModelTask("Read Book", "0/1"),
            ModelTask("Sleep Early", "0/1h"),
            ModelTask("Exercise", "0/30m"),
            ModelTask("1 DSA Problem", "0/1h"),
            ModelTask("Read Book", "0/1"),
            ModelTask("Sleep Early", "0/1h"),
            ModelTask("Exercise", "0/30m"),
            ModelTask("1 DSA Problem", "0/1h"),
            ModelTask("Read Book", "0/1"),
        )
        adapterStartedTask.dataNotify(listTask)
    }
}

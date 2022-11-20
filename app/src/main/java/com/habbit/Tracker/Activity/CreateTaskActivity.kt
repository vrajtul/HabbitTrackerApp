package com.habbit.Tracker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.habbit.Tracker.R
import com.habbit.Tracker.databinding.ActivityCreateTaskBinding

class CreateTaskActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




    }
}
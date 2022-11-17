package com.habbit.Tracker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.habbit.Tracker.R
import com.habbit.Tracker.databinding.ActivityMainBinding
import com.habbit.Tracker.databinding.ActivitySelectCategoryBinding

class SelectCategoryActivity : AppCompatActivity() {
    lateinit var binding: ActivitySelectCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}
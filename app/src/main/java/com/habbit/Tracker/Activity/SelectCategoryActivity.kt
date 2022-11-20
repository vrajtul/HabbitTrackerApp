package com.habbit.Tracker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.habbit.Tracker.Adapter.AdapterCategories
import com.habbit.Tracker.Adapter.AdapterStartedTask
import com.habbit.Tracker.Model.ModelCategories
import com.habbit.Tracker.Model.ModelTask
import com.habbit.Tracker.R
import com.habbit.Tracker.databinding.ActivitySelectCategoryBinding

class SelectCategoryActivity : AppCompatActivity() {

    private lateinit var listCategories: List<ModelCategories>
    private lateinit var adapterCategories: AdapterCategories

    lateinit var binding: ActivitySelectCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adapterCategories = AdapterCategories()
        loadDataFromDB()

        binding.recyclerHabitCategories.setLayoutManager(LinearLayoutManager(this))
        binding.recyclerHabitCategories.adapter = adapterCategories

    }

    private fun loadDataFromDB() {
        listCategories = listOf(
            ModelCategories("Exercise", R.drawable.ic_excercise, 0),
            ModelCategories("Read a Book", R.drawable.ic_excercise, 1),
            ModelCategories("Water to Plants", R.drawable.ic_excercise, 2),
            ModelCategories("Take Medicine", R.drawable.ic_excercise, 3),
            ModelCategories("Drink Water", R.drawable.ic_excercise, 4),
            ModelCategories("Eat Fruits", R.drawable.ic_excercise, 5),
            ModelCategories("Call Parents", R.drawable.ic_excercise, 6),
            ModelCategories("Sleep Early", R.drawable.ic_excercise, 7),
        )
        adapterCategories.dataNotify(listCategories)
    }

}
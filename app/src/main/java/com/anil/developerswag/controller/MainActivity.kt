package com.anil.developerswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.anil.developerswag.R
import com.anil.developerswag.model.Category
import com.anil.developerswag.service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        categoryListView.adapter = categoryAdapter


    }
}

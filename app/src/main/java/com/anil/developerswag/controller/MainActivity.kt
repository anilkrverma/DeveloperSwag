package com.anil.developerswag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anil.developerswag.R
import com.anil.developerswag.adapters.CategoryAdapter
import com.anil.developerswag.service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryAdapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = categoryAdapter


    }
}

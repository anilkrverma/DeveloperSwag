package com.anil.developerswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.anil.developerswag.R
import com.anil.developerswag.model.Category

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var categoryView = LayoutInflater.from(context).inflate(R.layout.category_list, null)

        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryList)
        val categoryText: TextView = categoryView.findViewById(R.id.categoryText)

        val category = categories[position]
        categoryText.text = category.categoryName

        val resourceId =
            context.resources.getIdentifier(category.imageSrc, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)

        println("Hello $resourceId")

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.size
    }

}
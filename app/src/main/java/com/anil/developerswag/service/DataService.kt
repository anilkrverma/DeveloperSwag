package com.anil.developerswag.service

import com.anil.developerswag.model.Category
import com.anil.developerswag.model.Product

object DataService {

    var categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalimage")
    )

    var shirts = listOf(
        Product("Shirt 1", "Rs. 100", "shirt1"),
        Product("Shirt 2", "Rs. 200", "shirt2"),
        Product("Shirt 3", "Rs. 300", "shirt3"),
        Product("Shirt 4", "Rs. 400", "shirt4"),
        Product("Shirt 5", "Rs. 500", "shirt5")
    )

    var hoodies = listOf(
        Product("Hoodie 1", "Rs. 110", "hoodie1"),
        Product("Hoodie 2", "Rs. 220", "hoodie2"),
        Product("Hoodie 3", "Rs. 330", "hoodie3"),
        Product("Hoodie 4", "Rs. 440", "hoodie4")
    )

    var hat = listOf(
        Product("Hat 1", "Rs. 50", "hat1"),
        Product("Hat 2", "Rs. 60", "hat2"),
        Product("Hat 3", "Rs. 70", "hat3"),
        Product("Hat 4", "Rs. 80", "hat4")
    )

}
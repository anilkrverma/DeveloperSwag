package com.anil.developerswag.model

class Product(val productName: String, val price: String, val imageSrc: String) {
    override fun toString(): String {
        return productName
    }
}
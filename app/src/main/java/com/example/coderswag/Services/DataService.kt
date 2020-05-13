package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hsts = listOf(
        Product("Devslopers Graphic Beanie", "$18", "hat1"),
        Product("Devslopers Hat Black", "$20", "hat2"),
        Product("Devslopers Hat White ", "$18", "hat3"),
        Product("Devslopers Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopers Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopers Hoodie Red", "$32", "hoodie2"),
        Product("Devslopers Gray Hoodie", "$28", "hoodie3"),
        Product("Devslopers Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopers Shirt Black", "$18", "shirt1"),
        Product("Devslopers Badge Light Gray", "$20", "shirt2"),
        Product("Devslopers Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopers Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )


    val digitalGood = listOf<Product>()

    fun getProducts (category: String) : List <Product>{
        when (category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }
}
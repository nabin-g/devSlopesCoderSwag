package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hsts = listOf(
        Product("Devslopers Graphic Beanie", "$18", "hat01"),
        Product("Devslopers Hat Black", "$20", "hat02"),
        Product("Devslopers Hat White ", "$18", "hat03"),
        Product("Devslopers Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopers Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopers Hoodie Red", "$32", "hoodie02"),
        Product("Devslopers Gray Hoodie", "$28", "hoodie03"),
        Product("Devslopers Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopers Shirt Black", "$18", "shirt01"),
        Product("Devslopers Badge Light Gray", "$20", "shirt02"),
        Product("Devslopers Logo Shirt Red", "$22", "shirt03"),
        Product("Devslopers Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}
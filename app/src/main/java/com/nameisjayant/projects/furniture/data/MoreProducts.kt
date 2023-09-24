package com.nameisjayant.projects.furniture.data

import androidx.annotation.DrawableRes
import com.nameisjayant.chatapp.R


data class MoreProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)
val MoreProductList = listOf(
    MoreProducts(
        1,
        "Kids Bed",
        R.drawable.kids1,
        "kshs 400"
    ),
    MoreProducts(
        2,
        "Kids Bed",
        R.drawable.kids2,
        "Kshs 999"
    ),
    MoreProducts(
        3,
        "Kids Bed",
        R.drawable.kids3,
        "kshs 800"
    ),
    MoreProducts(
        4,
        "Kids Bed",
        R.drawable.kids4,
        "kshs 700"
    ),
    MoreProducts(
        5,
        "Kids Bed",
        R.drawable.kids5,
        "kshs 1100"
    ),
    MoreProducts(
        6,
        "Kids Bed",
        R.drawable.kids6,
        "kshs 400"
    ),
    MoreProducts(
        7,
        "Kids Bed",
        R.drawable.kids7,
        "kshs 1300"
    ),
    MoreProducts(
        8,
        "Kids Bed",
        R.drawable.kids8,
        "kshs 900"
    ),
    MoreProducts(
        9,
        "Kids Bed",
        R.drawable.kids9,
        "kshs 900"
    ),
    MoreProducts(
        10,
        "Kids Bed",
        R.drawable.kids10,
        "kshs 900"
    ),
    MoreProducts(
        11,
        "Bed",
        R.drawable.bed1,
        "kshs 900"
    ),
    MoreProducts(
        12,
        "Bed",
        R.drawable.bed2,
        "kshs 900"
    ),
    MoreProducts(
        13,
        "Bed",
        R.drawable.bed3,
        "kshs 900"
    ),
    MoreProducts(
        14,
        "Bed",
        R.drawable.bed4,
        "kshs 900"
    ),
    MoreProducts(
        15,
        "Bed",
        R.drawable.bed5,
        "kshs 900"
    ),


)


package com.nameisjayant.projects.furniture.data

import androidx.annotation.DrawableRes
import com.nameisjayant.chatapp.R

data class PopularProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)

val popularProductList = listOf(
    PopularProducts(
        1,
        "Armless chair",
        R.drawable.pc,
        "Ksh 400"
    ),
    PopularProducts(
        2,
        "Sofa",
        R.drawable.ps1,
        "kshs 999"
    ),
    PopularProducts(
        3,
        "L-Shape Sofa",
        R.drawable.ps,
        "kshs 800"
    ),
    PopularProducts(
        4,
        "Round Table + Stools",
        R.drawable.pst,
        "kshs 700"
    ),
    PopularProducts(
        5,
        "Bed",
        R.drawable.pb,
        "kshs 1100"
    ),
    PopularProducts(
        6,
        "Table",
        R.drawable.pt,
        "kshs 400"
    ),
    PopularProducts(
        7,
        "Double Decker",
        R.drawable.pddb,
        "kshs 1300"
    ),
    PopularProducts(
        8,
        "Bed",
        R.drawable.pb1,
        "kshs 900"
    )
)
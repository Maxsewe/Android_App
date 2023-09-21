package com.nameisjayant.projects.furniture.data

import androidx.annotation.DrawableRes
import com.nameisjayant.chatapp.R


data class ShoppingBag(
    val id: Int,
    @DrawableRes val icon: Int,
    val title: String,
    val qty: Int,
    val price: String
)

val shoppingList = listOf(
    ShoppingBag(
        1,
        R.drawable.sofa_1,
        "Sofa",
        1,
        "kshs 566"
    ),
    ShoppingBag(
        2,
        R.drawable.pc,
        "Chair",
        3,
        "kshs 566"
    ),
    ShoppingBag(
        3,
        R.drawable.ps,
        "Sofa",
        1,
        "kshs 566"
    ),

    )
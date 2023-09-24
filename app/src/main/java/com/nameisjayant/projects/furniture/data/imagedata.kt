package com.nameisjayant.projects.furniture.data

import com.nameisjayant.chatapp.R

data class ImageData(

    val title :String,
    val rating : Float,
    val desc :String,
    val imgUri:Int
)

/**
 * create Kids List
 * */

val imageList = listOf(
    ImageData(
        "Phadozz Furniture",
        4.0f,
        "For quality, affordable furniture. The comfort of your home",
        R.drawable.banner1
    ),
    ImageData(
        "Phadozz Furniture",
        4.0f,
        "We custom make: Modern Furniture; Sofa sets, Dinning Sets, Beds, Coffee Tables, Wall Units, Tv Stands..",
        R.drawable.banner2
    ),
    ImageData(
        "Visit here",
        4.0f,
        "Visit us along Outerring Road, Kware Stage or call 0721392969, for more designs and a variety to choose from",
        R.drawable.banner3
    ),
    ImageData(
        "Offers",
        4.0f,
        "Mega Sale Offers available",
        R.drawable.banner4
    ),
    ImageData(
        "Customized Products",
        4.0f,
        "Serving Quality",
        R.drawable.banner5
    ),
    ImageData(
        "Phadozz Furniture",
        4.0f,
        "What I Ordered is what was delivered",
        R.drawable.banner3
    )

)
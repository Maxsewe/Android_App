package com.nameisjayant.projects.furniture.data

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nameisjayant.chatapp.R
import com.nameisjayant.projects.furniture.data.ui.theme.ChatAppTheme

class MProducts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
        }
    }

    companion object {
        fun startActivity(intent: Intent) {
            TODO("Not yet implemented")
        }
    }
}

data class MoreProducts(
    val id: Int,
    val title: String,
    @DrawableRes val image: Int,
    val price: String
)
val MoreProductList = listOf(
    MoreProducts(
        1,
        "Armless chair",
        R.drawable.pc,
        "$400"
    ),
    MoreProducts(
        2,
        "Sofa",
        R.drawable.ps1,
        "$999"
    ),
    MoreProducts(
        3,
        "L-Shape Sofa",
        R.drawable.ps,
        "$800"
    ),
    MoreProducts(
        4,
        "Round Table + Stools",
        R.drawable.pst,
        "$700"
    ),
    MoreProducts(
        5,
        "Bed",
        R.drawable.pb,
        "$1100"
    ),
    MoreProducts(
        6,
        "Table",
        R.drawable.pt,
        "$400"
    ),
    MoreProducts(
        7,
        "Double Decker",
        R.drawable.pddb,
        "$1300"
    ),
    MoreProducts(
        8,
        "Bed",
        R.drawable.pb1,
        "$900"
    )
)
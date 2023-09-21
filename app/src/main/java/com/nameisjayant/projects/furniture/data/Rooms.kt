package com.nameisjayant.projects.furniture.data

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.nameisjayant.chatapp.R
import com.nameisjayant.projects.ui.theme.cottonBall
import com.nameisjayant.projects.ui.theme.paledark
import com.nameisjayant.projects.ui.theme.texttitlewhite


data class Rooms(
    val id:Int,
    @DrawableRes val image:Int,
    val title:String

)

val roomList = listOf(
    Rooms(
        1,
        R.drawable.dr,
        "Dining Room"
    ),
    Rooms(
        2,
        R.drawable.br,
        "Bed Room"
    ),
    Rooms(
        3,
        R.drawable.lr,
        "Living Room"
    ),
    Rooms(
        4,
        R.drawable.kr,
        "Kids Room"
    )
)


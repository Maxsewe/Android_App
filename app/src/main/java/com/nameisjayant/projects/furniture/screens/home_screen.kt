package com.nameisjayant.projects.furniture.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.nameisjayant.chatapp.R
import com.nameisjayant.projects.ui.theme.LightGray_1
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.TopEnd
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import com.nameisjayant.projects.chat.components.SpacerHeight
import com.nameisjayant.projects.chat.components.SpacerWidth
import com.nameisjayant.projects.furniture.data.Category
import com.nameisjayant.projects.furniture.data.MoreProductList
import com.nameisjayant.projects.furniture.data.MoreProducts
import com.nameisjayant.projects.furniture.data.PopularProducts
import com.nameisjayant.projects.furniture.data.Rooms
import com.nameisjayant.projects.furniture.data.categoryList
import com.nameisjayant.projects.furniture.data.popularProductList
import com.nameisjayant.projects.furniture.data.roomList
import com.nameisjayant.projects.furniture.navigation.ProductDetail
import com.nameisjayant.projects.furniture.data.BottomBar
import com.nameisjayant.projects.furniture.data.TopBarWithBack
import com.nameisjayant.projects.ui.theme.DarkOrange
import com.nameisjayant.projects.ui.theme.paledark
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {

    var text by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        item {
            TopBarWithBack(title = "String", onBackClick = {})
//            Logo()
            Header()
            CustomTextField(text = text, onValueChange = { text = it })
            SpacerHeight(20.dp)
            BannerRow()
            SpacerHeight(20.dp)
            CategoryRow()
            SpacerHeight(20.dp)
            PopularRow{
                navHostController.navigate(ProductDetail)
            }

            Rooms()
            MoreProducts()
            BottomBar()
        }

    }
}

@Composable
fun Rooms() {

    Column {
        Text(
            text = stringResource(id = R.string.rooms), style = TextStyle(
                fontWeight = FontWeight.W600,
                fontSize = 20.sp,
                color = Color(0xff8031A7)
            )
        )
        SpacerHeight(5.dp)
        Text(
            text = stringResource(id = R.string.room_des), style = TextStyle(
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                color = Color(0xffFF1694)
            )
        )
        SpacerHeight()
        LazyRow {
            items(roomList, key = { it.id }) {
                RoomSection(rooms = it)
            }
        }
    }

}

@Composable
fun RoomSection(
    rooms: Rooms
) {

    Box(
        modifier = Modifier.padding(end = 15.dp)
    ) {
        Image(
            painter = painterResource(id = rooms.image), contentDescription = "",
            modifier = Modifier
                .width(127.dp)
                .height(195.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Text(
            text = rooms.title, style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(0xffEE1B70D)
            ),
            modifier = Modifier
                .width(100.dp)
                .padding(20.dp)
        )
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BannerRow() {

    val banner = listOf(
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3,
        R.drawable.banner4
    )

        val pagerState = rememberPagerState()
        val scope = rememberCoroutineScope()
        Box(modifier = Modifier
            .fillMaxSize()
        ){
            HorizontalPager(pageCount = banner.size,
                state = pagerState,
                key = {banner[it]},

            pageSize = PageSize.Fixed (300.dp)
            ) { index ->
                Image(painter = painterResource(id = banner[index]),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .height(213.dp),

                )

            }
            Box(modifier = Modifier.run {
                offset(y = -(16).dp)
                    .fillMaxWidth(0.5f)
                    .clip(RoundedCornerShape(100))
//                .background(MaterialTheme.color.background)
                    .padding(8.dp)
                    .align(Alignment.BottomCenter)
            }
            ){
                IconButton(onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(
                            pagerState.settledPage -1
                        )
                    }
                },
                    modifier = Modifier
                        .align(Alignment.CenterStart)) {
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Go back")
                }
                IconButton(onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(
                            pagerState.settledPage + 1
                        )
                    }
                },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)) {
                    Icon(imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Go forward")
                }
            }
        }
    }


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PopularRow(
    onClick: () -> Unit
) {

    Column {
        CommonTitle(title = stringResource(id = R.string.popular))
        SpacerHeight()
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            popularProductList.forEach {
                PopularEachRow(data = it){
                    onClick()
                }
            }
        }
    }

}

@Composable
fun PopularEachRow(
    data: PopularProducts,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Column(
        modifier = modifier
            .padding(vertical = 5.dp)
            .clickable { onClick() }
    ) {
        Box {
            Image(
                painter = painterResource(id = data.image), contentDescription = "",
                modifier = Modifier
                    .width(141.dp)
                    .height(149.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.wishlist), contentDescription = "",
                modifier = Modifier
                    .padding(15.dp)
                    .size(32.dp)
                    .align(TopEnd)
                .background(Color.Cyan),
                tint = Color.Unspecified
            )
        }
        SpacerHeight()
        ElevatedCard(
            modifier = Modifier
                .align(CenterHorizontally)
        ) {
            Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp)) {
                Text(
                    text = data.title, style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                        color = Color(0xff281D5E)
                    )
                )
                Text(
                    text = data.price, style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black
                    )
                )
            }
        }
  }
}

@Composable
fun CategoryRow() {

    Column() {
        CommonTitle(title = stringResource(id = R.string.categories))
        SpacerHeight(20.dp)
        LazyRow {
            items(categoryList, key = { it.id }) {
                CategoryEachRow(category = it)
            }
        }
    }
}

@Composable
fun CategoryEachRow(
    category: Category
) {

    Box(
        modifier = Modifier
            .padding(end = 15.dp)
            .background(category.color, RoundedCornerShape(8.dp))
            .width(180.dp)
            .height(120.dp)
            .background(Color(0xffDFCCAF))
    ) {
        Image(
            painter = painterResource(id = category.image), contentDescription = "",
            modifier = Modifier
                .size(160.dp)
                .padding(end = 5.dp)
                .align(BottomEnd)

        )
        Text(
            text = category.title, style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(0xffF31544  )
            ),
            modifier = Modifier
                .padding(start = 5.dp)
                .align(CenterStart)
        )

    }

}

@Composable
fun CommonTitle(
    title: String,
    onClick: () -> Unit = {}
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title, style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.W600,
                color = Color.Black
            )
        )
        TextButton(onClick = onClick) {
            Text(
                text = stringResource(id = R.string.see_all), style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = DarkOrange
                )
            )
            SpacerWidth(3.dp)
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "",
                tint = DarkOrange,
                modifier = Modifier.size(20.dp)
            )
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    text: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {

    OutlinedTextField(
        value = text, onValueChange = onValueChange,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(
                text = stringResource(id = R.string.placeholder), style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W400,
                    color = LightGray_1
                )
            )
        },
        shape = RoundedCornerShape(8.dp),
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search2),
                contentDescription = "",
                tint = LightGray_1
            )
        },
        modifier = modifier
            .padding(vertical = 20.dp)
            .fillMaxWidth()
            .border(1.dp, LightGray_1, RoundedCornerShape(8.dp)),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
    )

}

@Composable
fun Header(
    onClick: () -> Unit = {}
) {
    Row {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo2),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 5.dp)
                    .align(TopStart)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(id = R.string.heading_text), style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.W600,
                color = Color(0xffFFA6C9)
            )
        )
        IconButton(
            onClick = onClick, modifier = Modifier
                .size(32.dp)
                .align(CenterVertically)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.notification), contentDescription = "",
                tint = Color.Unspecified
            )
        }
    }

}

@Composable
fun MoreProducts() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "New",
            color = paledark,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Soon",
            color = paledark,
            fontSize = 14.sp,
            modifier = Modifier.offset((-60).dp)
        )

        Button(
            onClick = {

            },
            modifier = Modifier
                .height(70.dp)
                .width(110.dp)
                .offset((20).dp),
            elevation = null,
            shape = RoundedCornerShape(
                topStartPercent = 50,
            ),
            colors = ButtonDefaults.buttonColors(paledark)
        ) {
            Text(
                text = "More Products",
                color = Color.White,
                fontSize = 12.sp
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier.padding(start = 5.dp),
                tint = Color.White
            )

        }
    }
//    SofaRow{
//
//    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SofaRow(
    onClick: () -> Unit
) {

    Column {
        CommonTitle(title = stringResource(id = R.string.more))
        SpacerHeight()
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            MoreProductList.forEach {
                SofaEachRow(data = it){
                    onClick()
                }
            }
        }
    }

}

@Composable
fun SofaEachRow(
    data: MoreProducts,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Column(
        modifier = modifier
            .padding(vertical = 5.dp)
            .clickable { onClick() }
    ) {
        Box {
            Image(
                painter = painterResource(id = data.image), contentDescription = "",
                modifier = Modifier
                    .width(141.dp)
                    .height(149.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.wishlist), contentDescription = "",
                modifier = Modifier
                    .padding(15.dp)
                    .size(32.dp)
                    .align(TopEnd),
                tint = Color.Unspecified
            )
        }
        SpacerHeight()
        ElevatedCard(
            modifier = Modifier
                .align(CenterHorizontally)
        ) {
            Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp)) {
                Text(
                    text = data.title, style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                        color = Color(0xff281D5E)
                    )
                )
                Text(
                    text = data.price, style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black
                    )
                )
            }
        }
    }
}



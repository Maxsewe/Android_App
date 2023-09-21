//package com.nameisjayant.projects.furniture.data
//
//import android.graphics.PorterDuff
//import android.widget.RatingBar
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.ExperimentalFoundationApi
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.pager.HorizontalPager
//import androidx.compose.foundation.pager.PagerState
//import androidx.compose.foundation.pager.rememberPagerState
//import androidx.compose.material3.Card
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.graphicsLayer
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.font.lerp
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.google.accompanist.pager.ExperimentalPagerApi
//import com.google.accompanist.pager.HorizontalPagerIndicator
//import kotlinx.coroutines.delay
//import java.lang.Thread.yield
//
//@ExperimentalPagerApi
//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun ViewPagerSlider(){
//
//    val pagerState  = rememberPagerState(
//        pageCount = imageList.size,
//        initialPage =  2
//    )
//
//    LaunchedEffect(Unit){
//        while (true){
//            yield()
//            delay(4000)
//            pagerState.animateScrollToPage(
//                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
//                animationSpec = tween(600)
//            )
//        }
//    }
//
//    Column(modifier = Modifier .background(Color.White)) {
//
//        HorizontalPager(state = pagerState,
//            modifier = Modifier
//        ) { page ->
//            Card(modifier = Modifier
//                .graphicsLayer {
//                    val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
//
//                    lerp(
//                        start = 0.85f,
//                        stop = 1f,
//                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
//                    ).also { scale ->
//                        scaleX = scale
//                        scaleY = scale
//
//                    }
//                    alpha = lerp(
//                        start = 0.5f,
//                        stop = 1f,
//                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
//                    )
//
//                }
//                .fillMaxWidth(),
//            ) {
//
//                val newKids = imageList[page]
//                Box(modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White)
//                ) {
//                    Image(painter = painterResource(
//                        id = newKids.imgUri
//                    ),
//                        contentDescription = "Image",
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier .fillMaxWidth()
//                    )
//
//                    Column(modifier = Modifier
//                        .align(Alignment.BottomStart)
//                        .padding(15.dp)
//                    ) {
//
//                        Text(
//                            text = newKids.title,
//                            style = MaterialTheme.typography.h6,
//                            color = Color.White,
//                            fontWeight = FontWeight.Bold
//                        )
//                        val ratingBar = RatingBar(
//                            LocalContext.current, null,
//                        ).apply {
//                            rating = newKids.rating
//                            progressDrawable.setColorFilter(
//                                android.graphics.Color.parseColor("#FF0000"),
//                                PorterDuff.Mode.SRC_ATOP
//                            )
//                        }
//
////                        AndroidView(factory ={ratingBar},
////                            modifier = Modifier.padding(0.dp,8.dp,0.dp,0.dp)
////                        )
//                        Text(
//                            text = newKids.desc,
//                            style = MaterialTheme.typography.body2,
//                            color = Color.White,
//                            fontWeight = FontWeight.Normal,
//                            modifier = Modifier.padding(0.dp,8.dp,0.dp,0.dp)
//                        )
//
//
//                    }
//
//                }
//
//
//            }
//
//        }
//
//        //Horizontal dot indicator
//        HorizontalPagerIndicator(
//            pagerState = pagerState,modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .padding(16.dp)
//        )
//
//    }
//
//}
//
//@OptIn(ExperimentalFoundationApi::class)
//fun HorizontalPagerIndicator(pagerState: PagerState, modifier: Modifier) {
//
//}
//
//@OptIn(ExperimentalPagerApi::class)
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun PreviewSlider(){
//    ViewPagerSlider()
//}
package com.nameisjayant.projects.starbucks.data.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nameisjayant.projects.starbucks.data.screens.HomeScreen
import com.nameisjayant.projects.starbucks.data.screens.ProductDetailScreen

@Composable
fun StartScreen() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController,
        startDestination = start){
//        composable(start){
//            StartScreen(navHostController = navHostController)
//        }
        composable(start){
            SplashScreen(navHostController = navHostController)
        }
        composable(home){
            HomeScreen(navHostController = navHostController)
        }
        composable(product_detail){
            ProductDetailScreen(navHostController = navHostController)
        }
    }

}

fun SplashScreen(navHostController: NavHostController) {
    TODO("Not yet implemented")
}

//const val start = "start_screen"
const val start = "SplashScreen"
const val home = "home_screen"
const val product_detail ="product_detail_screen"

//const val ROUTE_HOME = "Home"
//const val ROUTE_LOGIN = "Login"
//const val ROUTE_SIGNUP = "Signup"
//const val ROUTE_PRODUCTLIST = "ProductList"
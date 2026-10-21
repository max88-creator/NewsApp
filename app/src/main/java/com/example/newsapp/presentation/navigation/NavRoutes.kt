package com.example.newsapp.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object Login : Screen()

    @Serializable
    data object Register : Screen()

    @Serializable
    data object Main : Screen()
}

//@Serializable
//sealed interface NavigationRoutes {
//    @Serializable
//    data object Home: NavigationRoutes
//    @Serializable
//    data object User: NavigationRoutes
//    @Serializable
//    data object Favorites: NavigationRoutes
//    @Serializable
//    data object ProductList: NavigationRoutes
//    @Serializable
//    data object Basket: NavigationRoutes
//}
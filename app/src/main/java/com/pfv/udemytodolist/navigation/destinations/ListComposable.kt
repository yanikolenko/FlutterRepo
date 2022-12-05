package com.pfv.udemytodolist.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pfv.udemytodolist.util.Constants
import com.pfv.udemytodolist.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(
            navArgument(name = Constants.LIST_ARGUMENT_KEY){
                type = NavType.StringType
            }
        )
    ){

    }
}
package com.pfv.udemytodolist.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pfv.udemytodolist.util.Action
import com.pfv.udemytodolist.util.Constants
import com.pfv.udemytodolist.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(
            navArgument(name = Constants.TASK_ARGUMENT_KEY) {
                type = NavType.IntType
            }
        )
    ) {

    }
}

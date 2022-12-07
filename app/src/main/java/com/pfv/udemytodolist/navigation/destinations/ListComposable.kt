package com.pfv.udemytodolist.navigation.destinations

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pfv.udemytodolist.ui.screens.list.ListScreen
import com.pfv.udemytodolist.util.Constants
import com.pfv.udemytodolist.util.Constants.LIST_SCREEN
import com.pfv.udemytodolist.view_model.SharedViewModel

fun NavGraphBuilder.listComposable(
    viewModel: SharedViewModel,
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
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = viewModel
        )
    }
}
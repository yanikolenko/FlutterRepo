package com.pfv.udemytodolist.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.pfv.udemytodolist.navigation.destinations.listComposable
import com.pfv.udemytodolist.navigation.destinations.taskComposable
import com.pfv.udemytodolist.util.Constants
import com.pfv.udemytodolist.view_model.SharedViewModel

@Composable
fun SetupNavigation(navController: NavHostController) {

    val screen = remember(navController) {
        Screens(navController = navController)
    }

    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(navController = navController, startDestination = Constants.LIST_SCREEN){

        listComposable(navigateToTaskScreen = screen.task, viewModel = sharedViewModel)
        taskComposable(navigateToListScreen = screen.list)
    }

    BackHandler{

    }
}
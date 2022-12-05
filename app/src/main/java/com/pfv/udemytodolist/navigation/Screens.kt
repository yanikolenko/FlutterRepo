package com.pfv.udemytodolist.navigation

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pfv.udemytodolist.util.Action
import com.pfv.udemytodolist.util.Constants

class Screens(navController: NavHostController){

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}"){
            popUpTo(Constants.LIST_SCREEN){
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }

}

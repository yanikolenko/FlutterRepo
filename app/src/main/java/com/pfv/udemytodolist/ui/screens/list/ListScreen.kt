package com.pfv.udemytodolist.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.pfv.udemytodolist.util.Action
import com.pfv.udemytodolist.view_model.SharedViewModel

@Composable
fun ListScreen(
    sharedViewModel: SharedViewModel,
    navigateToTaskScreen: (Int) -> Unit
) {

    val allTasks =

    Scaffold(
        topBar = {
            ListAppBar{

            }
        },
        floatingActionButton = {
            ListFab(
                navigateToTaskScreen = navigateToTaskScreen
            )
        },
        content = {
            ListContent()
        },
    )
}

@Composable
fun ListFab(
    navigateToTaskScreen: (Int) -> Unit
){

    FloatingActionButton(
        onClick = {
            navigateToTaskScreen(-1)
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Add ,
            contentDescription = "fab",
            tint = Color.White
        )
    }
}
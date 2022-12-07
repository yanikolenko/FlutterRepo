package com.pfv.udemytodolist.ui.screens.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.Typography
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pfv.udemytodolist.R
import com.pfv.udemytodolist.ui.theme.Typography

@Composable
fun ListAppBar(
    onDeleteClicked: () -> Unit
) {
    DefaultListAppBar(onDeleteClicked = onDeleteClicked)
}

@Composable
fun DefaultListAppBar(
    onDeleteClicked: () -> Unit
){
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.tasks),
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        actions = {
            DefaultListAppBarActions(onDeleteClicked = onDeleteClicked)
        }
    )
}

@Composable
fun DefaultListAppBarActions(
    onDeleteClicked: () -> Unit
){
    DeleteAllAction(onDeleteClicked = onDeleteClicked)
}

@Composable
fun DeleteAllAction(
    onDeleteClicked: () -> Unit
){

    var expanded by remember{ mutableStateOf(false) }

    IconButton(
        onClick = {
            expanded = !expanded
        }
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_three_dots),
            contentDescription = "img"
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = !expanded
            }
        ) {
            DropdownMenuItem(
                onClick = {
                    expanded = !expanded
                    onDeleteClicked()
                }
            ) {
                Text(
                    modifier = Modifier.padding(start = 4.dp),
                    text = stringResource(id = R.string.delete_all_action),
                    style = Typography.subtitle2
                )
            }
        }
    }

}

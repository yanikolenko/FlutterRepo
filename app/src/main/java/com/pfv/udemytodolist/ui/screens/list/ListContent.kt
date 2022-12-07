package com.pfv.udemytodolist.ui.screens.list

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pfv.udemytodolist.data.model.TaskPriority
import com.pfv.udemytodolist.data.model.ToDoTask
import com.pfv.udemytodolist.ui.theme.listItemBackgroundColour
import com.pfv.udemytodolist.ui.theme.taskItemTextColor

@Composable
fun ListContent() {
    LazyColumn{

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TaskItem(
    toDoTask: ToDoTask,
    navigateToTaskScreen: (taskId: Int) -> Unit
){
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = MaterialTheme.colors.listItemBackgroundColour,
        shape = RectangleShape,
        elevation = 2.dp,
        onClick = {
            navigateToTaskScreen(toDoTask.id)
        }
    ) {
        Column(
            modifier = Modifier
                .padding(all = 12.dp)
                .fillMaxWidth()
        ) {
            Row{
               Text(
                   text = toDoTask.title,
                   color = MaterialTheme.colors.taskItemTextColor,
                   style = MaterialTheme.typography.h5,
                   fontWeight = FontWeight.Bold,
                   maxLines = 1
               )
               Box(
                   modifier = Modifier
                       .fillMaxWidth(),
                   contentAlignment = Alignment.CenterEnd

               ){
                   Canvas(
                       modifier = Modifier.size(width = 16.dp, height = 16.dp),
                   ){
                       drawCircle(
                           color = toDoTask.priority.color
                       )
                   }
               }
            }

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = toDoTask.description,
                color = MaterialTheme.colors.taskItemTextColor,
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

        }

    }

}

@Composable
@Preview(showBackground = true)
fun TaskItemPreview(){
    TaskItem(
        toDoTask = ToDoTask(
            id = 0,
            title = "First Task",
            description = "Some Description of Task",
            priority = TaskPriority.HIGH
        ),
        navigateToTaskScreen = {}
    )
}
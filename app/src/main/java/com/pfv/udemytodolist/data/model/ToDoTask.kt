package com.pfv.udemytodolist.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pfv.udemytodolist.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: TaskPriority

)

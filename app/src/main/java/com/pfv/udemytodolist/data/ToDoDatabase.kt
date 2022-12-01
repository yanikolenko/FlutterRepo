package com.pfv.udemytodolist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pfv.udemytodolist.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}
package com.pfv.udemytodolist.di

import android.content.Context
import androidx.room.Room
import com.pfv.udemytodolist.data.ToDoDatabase
import com.pfv.udemytodolist.util.Constants
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        Constants.DATABASE_NAME
    )

    @Singleton
    @Provides
    fun provideDao(database: ToDoDatabase) = database.toDoDao()

}

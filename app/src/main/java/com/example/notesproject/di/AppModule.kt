package com.example.dbproject.di

import android.app.Application
import androidx.room.Room
import com.example.dbproject.model.contactsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application): contactsDatabase{
        val database = Room.databaseBuilder(
            app,
            contactsDatabase::class.java,
            "contacts_db"
        ).build()
        return database
    }

}
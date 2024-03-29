package com.example.dbproject.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class contactsDatabase: RoomDatabase() {
    abstract val dao: ContactDao
}
package com.download.assignment.core.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.download.assignment.data.local.dao.SomeDao
import com.download.assignment.data.models.entity.Entity


@Database(entities = [Entity::class], version = 1)
abstract class SomeDatabase : RoomDatabase() {

    abstract fun someDao() : SomeDao

}
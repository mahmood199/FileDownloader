package com.download.assignment.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.download.assignment.data.models.entity.Entity

@Dao
interface SomeDao {

    @Query("Select * from local_entity")
    suspend fun getAll(): List<Entity>


}
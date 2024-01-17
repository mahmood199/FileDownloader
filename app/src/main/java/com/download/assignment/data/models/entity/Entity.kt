package com.download.assignment.data.models.entity

import androidx.room.PrimaryKey

@androidx.room.Entity(tableName = "local_entity")
data class Entity(
	@PrimaryKey(autoGenerate = true)
	val x: Int,
)
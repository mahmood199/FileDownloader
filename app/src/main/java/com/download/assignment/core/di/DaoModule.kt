package com.download.assignment.core.di

import com.download.assignment.core.local.SomeDatabase
import com.download.assignment.data.local.dao.SomeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {

	@Provides
	fun providesSomeDao(someDatabase: SomeDatabase): SomeDao {
		return someDatabase.someDao()
	}

}
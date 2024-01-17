package com.download.assignment.core.di

import com.download.assignment.data.local.dao.SomeDao
import com.download.assignment.data.local.localDataSource.SomeLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalDataSourceModule {

	@Provides
	fun provideLocalDataSource(someDao: SomeDao): SomeLocalDataSource {
		return SomeLocalDataSource(someDao)
	}

}
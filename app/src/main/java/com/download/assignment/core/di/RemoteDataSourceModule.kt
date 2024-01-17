package com.download.assignment.core.di

import com.download.assignment.data.remote.remoteDataSource.SomeRemoteDataSource
import com.download.assignment.data.remote.remoteServices.SomeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceModule {

	@Provides
	fun provideRemoteDataSource(
		someService: SomeService,
	): SomeRemoteDataSource {
		return SomeRemoteDataSource(someService)
	}

}
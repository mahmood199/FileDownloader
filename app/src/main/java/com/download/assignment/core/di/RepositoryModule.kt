package com.download.assignment.core.di

import com.download.assignment.data.local.localDataSource.SomeLocalDataSource
import com.download.assignment.data.remote.remoteDataSource.SomeRemoteDataSource
import com.download.assignment.domain.repository.SomeRepository
import com.download.assignment.data.repositoryImpl.SomeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

	@Provides
	fun provideSomeRepository(
		someLocalDataSource: SomeLocalDataSource,
		someRemoteDataSource: SomeRemoteDataSource,
	): SomeRepository {
		return SomeRepositoryImpl(someLocalDataSource, someRemoteDataSource)
	}


}
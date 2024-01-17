package com.download.assignment.core.di

import com.download.assignment.data.remote.remoteServices.SomeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

	@Provides
	fun provideSomeService(retrofit: Retrofit): SomeService {
		return retrofit.create(SomeService::class.java)
	}

}
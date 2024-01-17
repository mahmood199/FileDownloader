package com.download.assignment.data.repositoryImpl

import com.download.assignment.core.network.Resource
import com.download.assignment.data.local.localDataSource.SomeLocalDataSource
import com.download.assignment.data.remote.remoteDataSource.SomeRemoteDataSource
import com.download.assignment.domain.repository.SomeRepository
import javax.inject.Inject

class SomeRepositoryImpl @Inject constructor(
    localDataSource: SomeLocalDataSource,
    remoteDataSource: SomeRemoteDataSource,
) : SomeRepository {

    override suspend fun someCrudOperation(): Resource<String> {
        return Resource.Success("Sucess")
    }

}
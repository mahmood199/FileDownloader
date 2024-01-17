package com.download.assignment.domain.usecase

import com.download.assignment.core.network.Resource
import com.download.assignment.domain.repository.SomeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class SomeUseCase @Inject constructor(
    private val someRepository: SomeRepository,
) {

    operator fun invoke(): Flow<Resource<String>> = flow {
        emit(Resource.Loading)
        val result = someRepository.someCrudOperation()
        emit(result)
    }.flowOn(Dispatchers.IO)


}
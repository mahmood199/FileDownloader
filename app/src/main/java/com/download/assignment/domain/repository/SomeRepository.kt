package com.download.assignment.domain.repository

import com.download.assignment.core.network.Resource

interface SomeRepository {
    suspend fun someCrudOperation(): Resource<String>
}
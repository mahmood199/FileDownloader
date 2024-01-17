package com.download.assignment.core.network

sealed class Resource<out T> {

    class Success<out T>(val value: T) : Resource<T>()

    class Failure(
        val failureStatus: FailureStatus,
        val code: Int? = null,
        val message: String? = null
    ) : Resource<Nothing>()

    data object Loading : Resource<Nothing>()

    data object Default : Resource<Nothing>()
}


enum class FailureStatus {
    EMPTY,
    API_FAIL,
    NO_INTERNET,
    ACCESS_DENIED,
    USER_UNAPPROVED,
    OTHER
}
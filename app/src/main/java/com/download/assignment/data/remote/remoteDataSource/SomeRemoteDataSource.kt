package com.download.assignment.data.remote.remoteDataSource

import com.download.assignment.data.remote.remoteServices.SomeService
import javax.inject.Inject

class SomeRemoteDataSource @Inject constructor(
	val someService: SomeService,
) {

}
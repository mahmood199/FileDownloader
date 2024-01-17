package com.download.assignment.data.remote.remoteServices

import com.download.assignment.data.models.request.Request
import com.download.assignment.data.models.response.Response

interface SomeService {
	suspend fun loginUser(request : Request) : Response
}
package com.download.assignment.data.local.localDataSource

import com.download.assignment.data.local.dao.SomeDao
import javax.inject.Inject

class SomeLocalDataSource @Inject constructor(
    val someDao: SomeDao
) {
}
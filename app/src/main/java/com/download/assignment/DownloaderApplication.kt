package com.download.assignment

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DownloaderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
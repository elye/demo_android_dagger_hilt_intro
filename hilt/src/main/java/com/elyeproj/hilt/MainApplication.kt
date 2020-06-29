package com.elyeproj.hilt

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication: Application() {
    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    init {
        Log.d("TrackLog", "MainApplication::initialize")
    }

    override fun onCreate() {
        super.onCreate()
        simpleDependency.printMe()
        applicationWideDependency.printMe()
    }
}

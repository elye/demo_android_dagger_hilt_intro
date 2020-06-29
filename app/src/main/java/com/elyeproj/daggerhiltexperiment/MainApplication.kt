package com.elyeproj.daggerhiltexperiment

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication: Application() {
    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    override fun onCreate() {
        super.onCreate()
        simpleDependency.printMe()
        applicationWideDependency.printMe()
    }
}

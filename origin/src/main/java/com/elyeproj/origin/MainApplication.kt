package com.elyeproj.origin

import android.app.Application
import android.util.Log
import javax.inject.Inject

class MainApplication: Application() {
    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    companion object {
        val component by lazy {
            DaggerApplicationComponent.create()
        }
    }

    init {
        Log.d("TrackLog", "MainApplication::initialize")
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        simpleDependency.printMe()
        applicationWideDependency.printMe()
    }
}

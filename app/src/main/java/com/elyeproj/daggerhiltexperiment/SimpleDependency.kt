package com.elyeproj.daggerhiltexperiment

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SimpleDependency @Inject constructor() {
    init {
        Log.d("TrackLog", "Injecting SimpleDependency $this")
    }

    fun printMe() {
        Log.d("TrackLog", "Printing SimpleDependency $this")
    }
}

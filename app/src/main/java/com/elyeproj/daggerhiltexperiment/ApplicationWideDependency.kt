package com.elyeproj.daggerhiltexperiment

import android.util.Log

class ApplicationWideDependency(private val simpleDependency: SimpleDependency) {
    init {
        Log.d("TrackLog", "Injecting ApplicationWideDependency $this")
    }

    fun printMe() {
        Log.d("TrackLog", "Printing ApplicationWideDependency $this")
    }
}

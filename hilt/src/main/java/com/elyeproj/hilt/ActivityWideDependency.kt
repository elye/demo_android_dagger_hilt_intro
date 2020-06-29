package com.elyeproj.hilt

import android.util.Log

class ActivityWideDependency(private val simpleDependency: SimpleDependency) {
    init {
        Log.d("TrackLog", "Injecting ActivityWideDependency $this")
    }

    fun printMe() {
        Log.d("TrackLog", "Printing ActivityWideDependency $this")
    }
}

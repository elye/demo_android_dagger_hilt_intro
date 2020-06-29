package com.elyeproj.origin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    @Inject
    lateinit var activityWideDependency: ActivityWideDependency

    init {
        Log.d("TrackLog", "MainActivity2::initialize")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainApplication.component.getActivityComponent().inject(this)
        setContentView(R.layout.activity_main2)
        simpleDependency.printMe()
        applicationWideDependency.printMe()
        activityWideDependency.printMe()
    }
}

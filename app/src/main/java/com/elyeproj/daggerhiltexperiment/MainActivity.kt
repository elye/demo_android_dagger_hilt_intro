package com.elyeproj.daggerhiltexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    @Inject
    lateinit var activityWideDependency: ActivityWideDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleDependency.printMe()
        applicationWideDependency.printMe()
        activityWideDependency.printMe()
    }
}

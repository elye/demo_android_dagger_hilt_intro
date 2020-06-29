package com.elyeproj.hilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var simpleDependency: SimpleDependency

    @Inject
    lateinit var applicationWideDependency: ApplicationWideDependency

    @Inject
    lateinit var activityWideDependency: ActivityWideDependency

    init {
        Log.d("TrackLog", "MainActivity::initialize")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleDependency.printMe()
        applicationWideDependency.printMe()
        activityWideDependency.printMe()

        my_txt.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}

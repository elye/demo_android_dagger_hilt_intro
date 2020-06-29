package com.elyeproj.simplehilt

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@HiltAndroidApp
class MainApplication: Application()

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_view.text = info.text
    }
}

class Info @Inject constructor() {
    val text = "Hello Dagger Hilt"
}

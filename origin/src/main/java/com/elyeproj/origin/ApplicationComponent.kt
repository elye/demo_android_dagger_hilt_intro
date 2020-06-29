package com.elyeproj.origin

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MainApplication)
    fun getActivityComponent(): ActivityComponent
}

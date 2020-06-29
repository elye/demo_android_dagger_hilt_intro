package com.elyeproj.daggerhiltexperiment

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @ActivityScoped
    @Provides
    fun provideActivityWideDependency(simpleDependency: SimpleDependency)
            = ActivityWideDependency(simpleDependency)
}

package com.elyeproj.daggerhiltexperiment

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationWideDependency(simpleDependency: SimpleDependency)
            = ApplicationWideDependency(simpleDependency)
}

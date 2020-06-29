package com.elyeproj.origin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationWideDependency(simpleDependency: SimpleDependency)
            = ApplicationWideDependency(simpleDependency)
}

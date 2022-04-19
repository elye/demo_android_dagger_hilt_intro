package com.elyeproj.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationWideDependency(simpleDependency: SimpleDependency)
            = ApplicationWideDependency(simpleDependency)
}

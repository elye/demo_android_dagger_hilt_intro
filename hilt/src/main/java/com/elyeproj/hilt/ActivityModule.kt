package com.elyeproj.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @ActivityScoped
    @Provides
    fun provideActivityWideDependency(simpleDependency: SimpleDependency)
            = ActivityWideDependency(simpleDependency)
}

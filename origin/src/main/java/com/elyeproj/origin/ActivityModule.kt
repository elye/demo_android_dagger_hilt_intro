package com.elyeproj.origin

import dagger.Module
import dagger.Provides

@Module
object ActivityModule {

    @ActivityScoped
    @Provides
    fun provideActivityWideDependency(simpleDependency: SimpleDependency)
            = ActivityWideDependency(simpleDependency)
}

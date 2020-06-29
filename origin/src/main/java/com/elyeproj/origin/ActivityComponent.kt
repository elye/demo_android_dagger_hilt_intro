package com.elyeproj.origin

import dagger.Subcomponent

@ActivityScoped
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)
}
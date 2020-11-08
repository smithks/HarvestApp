package com.keegansmith.ironharvestapp

import com.keegansmith.ironharvestapp.home.HomeActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(target: HomeActivity)
}
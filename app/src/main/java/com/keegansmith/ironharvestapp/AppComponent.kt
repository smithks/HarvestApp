package com.keegansmith.ironharvestapp

import com.keegansmith.ironharvestapp.home.HomeActivity
import dagger.Component
import javax.inject.Provider

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(target: HomeActivity)
}
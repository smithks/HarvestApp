package com.keegansmith.ironharvestapp

import com.keegansmith.api.ApiModule
import com.keegansmith.core.CoreModule
import dagger.Module

@Module(includes = [ApiModule::class, CoreModule::class])
class AppModule {
}
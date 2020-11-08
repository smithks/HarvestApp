package com.keegansmith.api

import com.keegansmith.core.RepoInterface
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun provideClassUsingInterface(repoInterface: RepoInterface): ClassUsingInterface {
        return ClassUsingInterface(repoInterface)
    }

}
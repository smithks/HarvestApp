package com.keegansmith.api

import com.keegansmith.core.RepoInterface
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ApiModule {

    @Provides
    fun provideClassUsingInterface(repoInterface: RepoInterface): ClassUsingInterface {
        return ClassUsingInterface(repoInterface)
    }

}
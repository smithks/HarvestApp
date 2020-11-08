package com.keegansmith.ironharvestapp

import com.keegansmith.core.RepoInterface
import dagger.Module
import dagger.Provides

@Module
class AppDependencyModule {

    @Provides
    fun provideRepoInterface(repoImplementation: RepoImplementation): RepoInterface {
        return repoImplementation
    }
}
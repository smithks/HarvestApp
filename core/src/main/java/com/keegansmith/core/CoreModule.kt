package com.keegansmith.core

import dagger.Module
import dagger.Provides
import javax.inject.Provider

@Module
class CoreModule(
    private val implDependencyProvider: Provider<RepoInterface>
) {

    @Provides
    fun provideRepoImp(): RepoInterface {
        return implDependencyProvider.get()
    }

//    @Provides
//    fun provideRepoInterface(): RepoInterface {
//        return object: RepoInterface {
//            override fun getRepoString(): String = "core provided"
//        }
//    }
}
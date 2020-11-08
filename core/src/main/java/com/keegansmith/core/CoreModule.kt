package com.keegansmith.core

import dagger.Module
import dagger.Provides

@Module
class CoreModule(
    private val repoInterface: RepoInterface
) {

    @Provides
    fun provideRepoImp(): RepoInterface {
        return repoInterface
    }

//    @Provides
//    fun provideRepoInterface(): RepoInterface {
//        return object: RepoInterface {
//            override fun getRepoString(): String = "core provided"
//        }
//    }
}
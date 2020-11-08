package com.keegansmith.ironharvestapp

import com.keegansmith.core.RepoInterface
import dagger.Component
import javax.inject.Provider

@Component(modules = [AppDependencyModule::class])
interface AppDependencyComponent {
    fun getRepoImplProvider(): Provider<RepoInterface>
}
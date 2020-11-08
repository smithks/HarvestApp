package com.keegansmith.core

import javax.inject.Provider

interface CoreDependencyProvider {
    fun getRepoImplProvider(): Provider<RepoInterface>
}
package com.keegansmith.api

import com.keegansmith.core.RepoInterface

class ClassUsingInterface constructor(val repoInterface: RepoInterface) {

    fun getString(): String {
        return repoInterface.getRepoString()
    }
}
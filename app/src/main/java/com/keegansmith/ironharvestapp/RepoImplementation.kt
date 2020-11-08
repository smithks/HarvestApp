package com.keegansmith.ironharvestapp

import com.keegansmith.core.RepoInterface

class RepoImplementation: RepoInterface {
    override fun getRepoString(): String {
        return "app provided"
    }
}
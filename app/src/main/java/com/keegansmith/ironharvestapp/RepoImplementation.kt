package com.keegansmith.ironharvestapp

import com.keegansmith.core.RepoInterface
import javax.inject.Inject

class RepoImplementation @Inject constructor(): RepoInterface {
    override fun getRepoString(): String {
        return "app provided"
    }
}
package com.auto1.applicationwithkoin

import org.koin.core.annotation.Named
import org.koin.core.annotation.Scoped
import org.koin.core.annotation.Single

@Single
@Named("Repo2")
class Repository1: MyRepo {
    override fun getResult(): String {
        return "Result from repo2"
    }
}
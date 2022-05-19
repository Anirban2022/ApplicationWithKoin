package com.auto1.applicationwithkoin

import org.koin.core.annotation.Factory
import org.koin.core.annotation.InjectedParam
import org.koin.core.annotation.Named
import org.koin.core.annotation.Single
import org.koin.core.qualifier.named

@Single
class MyUserCase(
    @Named("Repo2")
    private val repo: MyRepo
) : BaseUseCase<Int, String>() {
    override fun buildObservable(params: Int): String {
        return repo.getResult()
    }
}

//const val MY_USE_CASE = "MY_USE_CASE"
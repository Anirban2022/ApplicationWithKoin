package com.auto1.applicationwithkoin

import org.koin.core.annotation.Factory
import org.koin.core.annotation.Named

@Factory
@Named(MY_USE_CASE)
class MyUserCase(
    private val repo: MyRepo
) : BaseUseCase<Int, String>() {
    override fun buildObservable(params: Int): String {
        return ""
    }
}

const val MY_USE_CASE = "MY_USE_CASE"
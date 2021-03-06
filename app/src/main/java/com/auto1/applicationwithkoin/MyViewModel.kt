package com.auto1.applicationwithkoin

import androidx.lifecycle.ViewModel
import org.koin.android.annotation.KoinViewModel

class MyViewModel(
    private val useCase: BaseUseCase<Int, String>
):ViewModel() {

    fun getResult() = useCase.buildObservable(1)
}
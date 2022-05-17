package com.auto1.applicationwithkoin

import android.icu.util.Output
import java.util.concurrent.Executor

abstract class BaseUseCase<Params, Outputs>(
) {
    /**
     * Use this method to provide initial data source observable.
     *
     * @param params parameter object.
     *
     * @return observable.
     */
    abstract fun buildObservable(params: Params): Outputs
}
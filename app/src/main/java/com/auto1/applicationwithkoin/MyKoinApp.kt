package com.auto1.applicationwithkoin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyKoinApp : Application() {
    override fun onCreate() {
        super.onCreate()

//        startKoin {
//            androidContext(this@MyKoinApp)
//            modules(defaultModule)
//        }
    }
}
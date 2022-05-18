package com.auto1.applicationwithkoin

import com.auto1.data.SampleEntry
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Single

@Factory
class Repository :MyRepo{
    fun getEntry(): List<SampleEntry> {
        return emptyList()
    }

    override fun getResult(): String {
        return "Result"
    }
}
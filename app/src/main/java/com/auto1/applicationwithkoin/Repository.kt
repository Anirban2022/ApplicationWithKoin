package com.auto1.applicationwithkoin

import com.auto1.data.SampleEntry
import org.koin.core.annotation.Single

@Single
class Repository {
    fun getEntry(): List<SampleEntry> {
        return emptyList()
    }
}
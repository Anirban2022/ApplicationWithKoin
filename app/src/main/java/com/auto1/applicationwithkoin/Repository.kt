package com.auto1.applicationwithkoin

import com.auto1.data.SampleEntry
import org.koin.core.annotation.*

@Single
@Named("Repo1")
@Scope(MainActivity::class)
class Repository :MyRepo{
    fun getEntry(): List<SampleEntry> {
        return emptyList()
    }

    override fun getResult(): String {
        return "Result from repository"
    }
}
package com.example.daggerhilttesting.data.repository

import android.app.Application
import android.util.Log
import com.example.daggerhilttesting.R
import com.example.daggerhilttesting.data.remote.MyApi
import com.example.daggerhilttesting.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        Log.d("testHilt", "the app name is $appName")
    }
    override suspend fun doNetworkCall() {

    }
}
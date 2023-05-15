package com.example.daggerhilttesting.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}
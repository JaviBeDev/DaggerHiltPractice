package com.example.daggerhilttesting

import androidx.lifecycle.ViewModel
import com.example.daggerhilttesting.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {
}
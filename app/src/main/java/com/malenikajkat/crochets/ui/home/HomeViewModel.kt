package com.malenikajkat.crochets.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Игрушки вязанные крючком"
    }
    val text: LiveData<String> = _text
}
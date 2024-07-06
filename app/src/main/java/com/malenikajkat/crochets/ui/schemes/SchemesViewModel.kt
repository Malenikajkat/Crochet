package com.malenikajkat.crochets.ui.schemes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SchemesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is schemes Fragment"
    }
    val text: LiveData<String> = _text
}
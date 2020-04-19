package com.uludagcan.featuremoduleb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeatureScreenBViewModel: ViewModel() {

    val message = MutableLiveData<String>()

    fun readData(data: String?) {
        message.postValue(data ?: "")
    }
}
package com.uludagcan.featuremodulea

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.uludagcan.core.route.FeatureScreenBRouteContract
import org.koin.core.KoinComponent
import org.koin.core.inject

class FeatureScreenAViewModel: ViewModel(), KoinComponent {

    private val featureScreenBRoute: FeatureScreenBRouteContract by inject()
    val featureScreenBRouteNavigation = MutableLiveData<FeatureScreenBRouteContract>()
    val message = MutableLiveData<String>()

    fun navigateScreenB() {
        featureScreenBRoute.setup("Obiwan Kenobi")
        featureScreenBRouteNavigation.postValue(featureScreenBRoute)
    }

    fun readData(data: String?) {
        message.postValue(data ?: "")
    }
}
package com.uludagcan.core.route

import android.app.Activity

interface FeatureScreenARouteContract {
    fun setup(dataToPass: String)
    fun present(fromActivity: Activity)
}
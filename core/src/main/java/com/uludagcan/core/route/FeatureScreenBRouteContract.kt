package com.uludagcan.core.route

import android.app.Activity

interface FeatureScreenBRouteContract {
    fun setup(dataToPass: String)
    fun present(fromActivity: Activity)
}
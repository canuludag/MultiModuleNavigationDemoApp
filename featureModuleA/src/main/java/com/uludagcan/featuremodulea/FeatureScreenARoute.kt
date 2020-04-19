package com.uludagcan.featuremodulea

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.uludagcan.core.route.FeatureScreenARouteContract

class FeatureScreenARoute: FeatureScreenARouteContract {

    private var data: String? = null

    override fun setup(dataToPass: String) {
        data = dataToPass
    }

    override fun present(fromActivity: Activity) {
        val intent = Intent(fromActivity, FeatureScreenAActivity::class.java)
        val bundle = Bundle()
        bundle.putString("data", data)
        intent.putExtras(bundle)
        fromActivity.startActivity(intent)
    }
}
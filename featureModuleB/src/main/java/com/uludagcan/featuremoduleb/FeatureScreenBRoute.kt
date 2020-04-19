package com.uludagcan.featuremoduleb

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.uludagcan.core.route.FeatureScreenARouteContract
import com.uludagcan.core.route.FeatureScreenBRouteContract
import java.util.*

class FeatureScreenBRoute: FeatureScreenBRouteContract {

    private var data: String? = null

    override fun setup(dataToPass: String) {
        data = dataToPass
    }

    override fun present(fromActivity: Activity) {
        val intent = Intent(fromActivity, FeatureScreenBActivity::class.java)
        val bundle = Bundle()
        bundle.putString("data", data)
        intent.putExtras(bundle)
        fromActivity.startActivity(intent)
    }
}
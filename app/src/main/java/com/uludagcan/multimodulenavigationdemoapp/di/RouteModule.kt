package com.uludagcan.multimodulenavigationdemoapp.di

import com.uludagcan.core.route.FeatureScreenARouteContract
import com.uludagcan.core.route.FeatureScreenBRouteContract
import com.uludagcan.featuremodulea.FeatureScreenARoute
import com.uludagcan.featuremoduleb.FeatureScreenBRoute
import org.koin.dsl.module

val routeModule = module {
    factory<FeatureScreenARouteContract> { FeatureScreenARoute() }
    factory<FeatureScreenBRouteContract> { FeatureScreenBRoute() }
}
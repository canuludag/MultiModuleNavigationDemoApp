package com.uludagcan.multimodulenavigationdemoapp

import android.app.Application
import com.uludagcan.multimodulenavigationdemoapp.di.routeModule
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(routeModule)
        }
    }
}
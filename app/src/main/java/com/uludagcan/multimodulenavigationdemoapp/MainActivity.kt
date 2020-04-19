package com.uludagcan.multimodulenavigationdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        bindViewModel()
        bindClickListeners()
    }

    private fun bindViewModel() {
        bindRoutes()
    }

    private fun bindClickListeners() {
        buttonNavigateFeatureA?.setOnClickListener { viewModel.navigateFeatureScreenAClicked() }
        buttonNavigateFeatureB?.setOnClickListener { viewModel.navigateFeatureScreenBClicked() }
    }

    private fun bindRoutes() {
        viewModel.featureScreenARouteNavigation.observe(this, Observer { routeA ->
            routeA?.let {
                routeA.present(this)
                viewModel.featureScreenARouteNavigation.value = null
            }
        })

        viewModel.featureScreenBRouteNavigation.observe(this, Observer { routeB ->
            routeB?.let {
                routeB.present(this)
                viewModel.featureScreenBRouteNavigation.value = null
            }
        })
    }


}

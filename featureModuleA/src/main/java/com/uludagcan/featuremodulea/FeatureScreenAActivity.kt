package com.uludagcan.featuremodulea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_feature_screen_a.*

class FeatureScreenAActivity : AppCompatActivity() {

    private lateinit var viewModel : FeatureScreenAViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_screen_a)
        viewModel = ViewModelProvider(this).get(FeatureScreenAViewModel::class.java)

        readIntent(intent)
        bindClickListeners()
        bindViewModel()
    }

    private fun readIntent(intent: Intent?) {
        intent?.let {
            val data = it.getStringExtra("data")
            viewModel.readData(data)
        }
    }

    private fun bindViewModel() {
        bindRoutes()
        bindTextViews()
    }

    private fun bindClickListeners() {
        buttonOpenFeatureScreenB?.setOnClickListener { viewModel.navigateScreenB() }
    }

    private fun bindRoutes() {
        viewModel.featureScreenBRouteNavigation.observe(this, Observer { routeB ->
            routeB?.let {
                routeB.present(this)
                viewModel.featureScreenBRouteNavigation.value = null
            }
        })
    }

    private fun bindTextViews() {
        viewModel.message.observe(this, Observer { dataText?.text = it })
    }
}

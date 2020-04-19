package com.uludagcan.featuremoduleb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_feature_screen_b.*

class FeatureScreenBActivity : AppCompatActivity() {

    private lateinit var viewModel : FeatureScreenBViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_screen_b)
        viewModel = ViewModelProvider(this).get(FeatureScreenBViewModel::class.java)
        bindViewModel()
        readIntent(intent)
    }

    private fun readIntent(intent: Intent?) {
        intent?.let {
            val data = it.getStringExtra("data")
            viewModel.readData(data)
        }
    }

    private fun bindViewModel() {
        bindTextViews()
    }

    private fun bindTextViews() {
        viewModel.message.observe(this, Observer { dataText?.text = it })
    }
}

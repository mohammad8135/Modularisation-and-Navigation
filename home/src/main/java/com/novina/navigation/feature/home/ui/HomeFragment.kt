package com.novina.navigation.feature.home.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.novina.navigation.core.navigation.AppNavigator
import com.novina.navigation.feature.home.R
import com.novina.navigation.lib.detail.api.domain.data.DetailTransitionData
import com.novina.navigation.lib.detail.api.navigation.DetailFragmentNavigationParam
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    @Inject
    lateinit var navigator: AppNavigator

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.actionBtn).setOnClickListener { navigateToDetail() }
        view.findViewById<Button>(R.id.actionBtnDeeplink).setOnClickListener { navigateToDetailUsingDeeplink()}
    }

    private fun navigateToDetail() {
        navigator.navigate(DetailFragmentNavigationParam(this, DetailTransitionData(1)))
    }

    private fun navigateToDetailUsingDeeplink() {
        val navRequest = NavDeepLinkRequest.Builder.fromUri("myapp:/myapp.com/feature/favorites".toUri()).build()
        findNavController().navigate(navRequest)
    }
}
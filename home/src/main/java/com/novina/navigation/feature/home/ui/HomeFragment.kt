package com.novina.navigation.feature.home.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.novina.navigation.core.navigation.MainNavigator
import com.novina.navigation.lib.detail.api.domain.data.DetailTransitionData
import com.novina.navigation.lib.detail.api.navigation.DetailFragmentNavigationParam
import com.novina.navigation.feature.home.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    @Inject
    lateinit var navigator: MainNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<Button>(R.id.actionBtn).setOnClickListener { navigateToDetail() }
        return view
    }

    private fun navigateToDetail() {
        navigator.navigate(DetailFragmentNavigationParam(this, DetailTransitionData(1)))
    }
}
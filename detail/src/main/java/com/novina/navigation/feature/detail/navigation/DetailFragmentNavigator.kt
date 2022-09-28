package com.novina.navigation.feature.detail.navigation

import androidx.navigation.fragment.findNavController
import com.novina.navigation.core.navigation.Navigator
import com.novina.navigation.lib.detail.api.navigation.DetailFragmentNavigationParam
import com.novina.navigation.feature.detail.R
import com.novina.navigation.feature.detail.ui.DetailFragmentArgs
import javax.inject.Inject

internal class DetailFragmentNavigator @Inject constructor() : Navigator {
    override fun navigate(params: Navigator.Params) {
        require(params is DetailFragmentNavigationParam) {
            "This navigation route needs DetailFragmentNavigationParam"
        }

        params.fragment.findNavController()
            .navigate(
                resId = R.id.nav_detail,
                args = DetailFragmentArgs(params.extra.id).toBundle()
            )
    }

}
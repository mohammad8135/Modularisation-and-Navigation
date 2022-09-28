package com.novina.navigation.lib.detail.api.navigation

import androidx.fragment.app.Fragment
import com.novina.navigation.core.navigation.Navigator
import com.novina.navigation.lib.detail.api.domain.data.DetailTransitionData

object DetailFragmentNavigationRoute: Navigator.Route

class DetailFragmentNavigationParam(val fragment: Fragment, val extra: DetailTransitionData) : Navigator.Params {

    override val route: Navigator.Route
        get() = DetailFragmentNavigationRoute
}
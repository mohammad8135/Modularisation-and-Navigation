package com.novina.navigation.core.navigation

import javax.inject.Inject

class MainNavigator @Inject constructor(
    private val navigators: Map<Class<out Navigator.Route>, @JvmSuppressWildcards Navigator>
) :Navigator {
    override fun navigate(params: Navigator.Params) {
        val navigator = navigators[params.route::class.java]

        require(navigator != null) {
            "No Navigator found for route ${params.route} "
        }

        navigator.navigate(params)
    }

}
package com.novina.navigation.core.navigation

interface Navigator {

    fun navigate(params: Params)

    interface Route

    interface Params {
        val route: Route
    }
}
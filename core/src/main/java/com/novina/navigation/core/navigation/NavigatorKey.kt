package com.novina.navigation.core.navigation

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class NavigatorKey(val value: KClass<out Navigator.Route>)
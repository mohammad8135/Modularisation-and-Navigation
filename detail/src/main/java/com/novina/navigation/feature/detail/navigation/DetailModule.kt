package com.novina.navigation.feature.detail.navigation

import com.novina.navigation.core.navigation.Navigator
import com.novina.navigation.core.navigation.NavigatorKey
import com.novina.navigation.lib.detail.api.navigation.DetailFragmentNavigationRoute
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal abstract class DetailModule {

        @Binds
        @IntoMap
        @NavigatorKey(DetailFragmentNavigationRoute::class)
        @Singleton
        abstract fun provideDetailFragmentNavigator(navigator: DetailFragmentNavigator): Navigator
}
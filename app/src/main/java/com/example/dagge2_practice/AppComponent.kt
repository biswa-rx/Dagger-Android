package com.example.dagge2_practice

import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticServiceModule::class])
interface AppComponent {

    fun getAnalyticsService() : AnalyticService
}
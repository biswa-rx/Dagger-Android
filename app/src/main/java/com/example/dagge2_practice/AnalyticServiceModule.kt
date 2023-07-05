package com.example.dagge2_practice

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticServiceModule {

    @Singleton
    @Provides
    fun getFirebaseAnalytics() : AnalyticService{
        return FirebaseAnalytics()
    }
}
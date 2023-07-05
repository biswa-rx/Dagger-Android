package com.example.dagge2_practice

import dagger.Module
import dagger.Provides

@Module
class AnalyticServiceModule {

    @Provides
    fun getFirebaseAnalytics() : AnalyticService{
        return FirebaseAnalytics()
    }
}
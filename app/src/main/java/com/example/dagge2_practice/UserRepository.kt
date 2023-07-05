package com.example.dagge2_practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, Password: String)
}
@ApplicationScope
class SQLRepository @Inject constructor(private val analytics: AnalyticService): UserRepository{
    private val TAG = "biswa_rx"
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB")
        analytics.trackEvent("user","CREATED")
    }
}
class FirebaseRepository @Inject constructor(private val analytics: AnalyticService) : UserRepository{
    private val TAG = "biswa_rx"
    override fun saveUser(email: String, Password: String) {
        Log.d(TAG, "User saved in firebase")
        analytics.trackEvent("user","CREATED")
    }
}
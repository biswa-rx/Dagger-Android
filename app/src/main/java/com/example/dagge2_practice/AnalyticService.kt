package com.example.dagge2_practice

import android.util.Log

interface AnalyticService {
    fun  trackEvent(eventName: String, eventType: String)
}
class Mixpanel : AnalyticService{
    private val TAG = "biswa_rx"
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel : $eventName - $eventType")
    }
}
class FirebaseAnalytics : AnalyticService{
    private val TAG = "biswa_rx"
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel : $eventName - $eventType")
    }

}
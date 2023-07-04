package com.example.dagge2_practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface NotificationService{
    fun send(to: String,from: String,body: String?)
}
@ApplicationScope
class EmailService @Inject constructor() : NotificationService{
    private val TAG = "biswa_rx"
    override fun send(to: String,from: String, body: String?) {
        Log.d(TAG, "Email send")
    }
}

class MessageService(private val retryCount : Int) : NotificationService{
    private val TAG = "biswa_rx"
    override fun send(to: String,from: String, body: String?) {
        Log.d(TAG, "Message send - Retry count $retryCount")
    }
}
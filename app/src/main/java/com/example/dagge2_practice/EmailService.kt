package com.example.dagge2_practice

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    private val TAG = "biswa_rx"
    fun send(to: String,from: String, body: String?) {
        Log.d(TAG, "Email service")
    }
}
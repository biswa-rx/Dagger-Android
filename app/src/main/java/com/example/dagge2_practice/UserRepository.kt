package com.example.dagge2_practice

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    private val TAG = "biswa_rx"
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB")
    }
}
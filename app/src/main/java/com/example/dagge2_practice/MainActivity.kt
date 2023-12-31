package com.example.dagge2_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent = appComponent.getUserRegistrationComponentBuilder().retryCount(11).build()
        userRegistrationComponent.inject(this)

        userRegistrationService.resisterUser("Email","123")
    }
}
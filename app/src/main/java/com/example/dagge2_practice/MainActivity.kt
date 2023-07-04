package com.example.dagge2_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(4)
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()
        component.inject(this)

        userRegistrationService.resisterUser("Email","123")
    }
}
package com.example.dagge2_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    lateinit var emailService1: EmailService
    lateinit var emailService2: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as UserApplication).userRegistrationComponent
        component.inject(this)
        emailService1 = component.getEmailService()
        emailService2 = component.getEmailService()

        userRegistrationService.resisterUser("Email","123")
    }
}
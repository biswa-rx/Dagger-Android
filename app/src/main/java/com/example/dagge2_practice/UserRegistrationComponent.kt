package com.example.dagge2_practice

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService() : EmailService
}
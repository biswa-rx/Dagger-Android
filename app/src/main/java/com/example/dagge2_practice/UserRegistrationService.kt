package com.example.dagge2_practice

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun resisterUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "from_user", "You are registered")
    }
}
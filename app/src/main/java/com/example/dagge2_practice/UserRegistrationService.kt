package com.example.dagge2_practice

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: NotificationService
) {
    fun resisterUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "from_user", "You are registered")
    }

}
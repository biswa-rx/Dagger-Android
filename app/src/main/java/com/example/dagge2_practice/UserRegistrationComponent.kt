package com.example.dagge2_practice

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService() : EmailService

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
    }
}
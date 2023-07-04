package com.example.dagge2_practice

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }
}
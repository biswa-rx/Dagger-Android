package com.example.dagge2_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.getUserRegistrationService().resisterUser("abc@gamil.com","123")
        component.getEmailService().send("to","from","message")
    }
}
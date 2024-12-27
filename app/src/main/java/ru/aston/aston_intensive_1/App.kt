package ru.aston.aston_intensive_1

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val channel = NotificationChannel(
            "MUSIC_CHANNEL",
            "Music Playback",
            NotificationManager.IMPORTANCE_LOW
        )
        val manager = getSystemService(NotificationManager::class.java)
        manager.createNotificationChannel(channel)
    }
}

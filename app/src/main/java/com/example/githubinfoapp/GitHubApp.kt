package com.example.githubinfoapp

import android.app.Application
import com.example.githubinfoapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GitHubApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@GitHubApp)
            modules(appModule)
        }
    }
}
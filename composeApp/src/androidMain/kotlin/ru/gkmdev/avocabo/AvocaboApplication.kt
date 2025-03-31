package ru.gkmdev.avocabo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import ru.gkmdev.avocabo.di.initKoin

class AvocaboApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AvocaboApplication)
        }
    }
}
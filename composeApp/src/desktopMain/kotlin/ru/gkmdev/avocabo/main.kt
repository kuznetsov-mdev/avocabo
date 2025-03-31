package ru.gkmdev.avocabo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.koin.core.context.startKoin
import ru.gkmdev.avocabo.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Avocabo",
        ) {
            App()
        }
    }
}
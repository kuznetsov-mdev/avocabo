package ru.gkmdev.avocabo

import androidx.compose.ui.window.ComposeUIViewController
import ru.gkmdev.avocabo.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}
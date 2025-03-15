package ru.gkmdev.avocabo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
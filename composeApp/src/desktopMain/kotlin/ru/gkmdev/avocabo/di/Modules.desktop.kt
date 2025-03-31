package ru.gkmdev.avocabo.di

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ru.gkmdev.avocabo.dependencies.DbClient

actual val platformModule = module {
    singleOf(::DbClient)
}
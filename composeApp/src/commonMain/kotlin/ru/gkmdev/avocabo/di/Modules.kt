package ru.gkmdev.avocabo.di

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module
import ru.gkmdev.avocabo.CardsViewModel
import ru.gkmdev.avocabo.dependencies.CardsRepository
import ru.gkmdev.avocabo.dependencies.CardsRepositoryImpl


expect val platformModule: Module

val sharedModule = module {
    singleOf(::CardsRepositoryImpl).bind<CardsRepository>()
    viewModelOf(::CardsViewModel)
}
package ru.gkmdev.avocabo

import androidx.lifecycle.ViewModel
import ru.gkmdev.avocabo.dependencies.CardsRepository

class CardsViewModel(
    private val cardsRepository: CardsRepository
) : ViewModel() {

    fun getTestCard(): String {
        return cardsRepository.getCard()
    }

}
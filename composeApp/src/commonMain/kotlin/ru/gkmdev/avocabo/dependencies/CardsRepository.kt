package ru.gkmdev.avocabo.dependencies

interface CardsRepository {
    fun getCard(): String
}

class CardsRepositoryImpl(
    private val dbClient: DbClient
) : CardsRepository {
    override fun getCard(): String {
        return "Test card"
    }

}
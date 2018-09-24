import model.getOutput

class CustomerCare {
    fun shortestDistanceFromSilkDorbtoHallitharam(inputData: String): String {
        val naturalLanguageProcessor = NaturalLanguageProcessor()

        return naturalLanguageProcessor.getStatement(
                getOutput(
                        naturalLanguageProcessor.parse(inputData)
                ))
    }
}
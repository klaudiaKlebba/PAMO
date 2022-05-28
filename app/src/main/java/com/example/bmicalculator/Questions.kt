package com.example.bmicalculator

class Questions {
    var aQuestions = arrayOf(
        "Ile wody nalezy wypijac dziennie?",
        "Energia zawarta w pozywieniu jest mierzona w:",
        "Ostatni posilek nalezy jesc najpozniej:",
        "Podstawową zasadą diety paleo jest:",
        " W 100g ktorego z tych warzyw znajdziesz najwięcej zelaza?",
        "Czym jest laktaza??"
    )
    private val aChoices = arrayOf(arrayOf("0","8","2","4"), arrayOf("Kaloriach","Hektopaskalach","Stopniach","Kilogramach"), arrayOf("O godzinie 18","Pół godziny przed snem","O godzinie 21","2-3 godziny przed snem"), arrayOf("Spożywanie naturalnych, nieprzetworzonych produktów","Rezygnacja z wołowiny i wieprzowiny","Spożywanie wyłącznie owoców i warzyw","Zadne z powyzszych"), arrayOf("Jarmuż","Natka pietruszki","Czosnek","Szpinak"), arrayOf("Cukrem zawartym w mleku","Enzymem trawiącym cukier mleczny","Sfermentowaną laktozą","Chorobą układu pokarmowego"))
    private val correctAnswer = arrayOf(
        "2","Kaloriach","2-3 godziny przed snem","Spożywanie naturalnych, nieprzetworzonych produktów","Natka pietruszki","Enzymem trawiącym cukier mleczny"
    )

    fun getQuestion(a: Int): String {
        return aQuestions[a]
    }

    fun getChoice1(a: Int): String {
        return aChoices[a][0]
    }

    fun getChoice2(a: Int): String {
        return aChoices[a][1]
    }

    fun getChoice3(a: Int): String {
        return aChoices[a][2]
    }

    fun getChoice4(a: Int): String {
        return aChoices[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return correctAnswer[a]
    }
}
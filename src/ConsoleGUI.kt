fun main(){
    var userInput = 0
    println("Vad heter du?")
    var firstName = readLine()
    println("Tjenare  $firstName!")

    var logic = Logic(firstName.toString())


    do {
        println("1. Räkna tid")
        println("2. Räkna lön")
        println("3. Räkna ut ålder")
        println("4. Avsluta")
        userInput = readLine()?.toInt()!!

        when(userInput){
            1 -> {
                timeStampGUI(firstName)
                return }
            2 -> {println("Du valde två")
            return}
            3 -> { println("Du valde tre")
            return}
            4 -> { println("Hej då $firstName")
            return}
            else -> println("Gör ett giltigt val")
        }
    } while (userInput != 3)
}


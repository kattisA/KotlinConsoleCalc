fun main(){
    var userinput = 0
    println("Vad heter du?")
    var firstName = readLine()
    println("Tjenare  $firstName!")

    do {
        println("1. Räkna tid")
        println("2. Räkna lön")
        println("3. Avsluta")
        userinput = readLine()?.toInt()!!

        when(userinput){
            1 -> {
                println("Du valde ett")
                return }
            2 -> {println("Du valde två")
            return}
            3 -> { println("Hej då $firstName")
            return}
            else -> println("Gör ett giltigt val")
        }
    } while (userinput != 3)
}


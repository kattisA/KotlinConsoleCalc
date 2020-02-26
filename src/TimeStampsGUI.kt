import java.lang.IndexOutOfBoundsException

fun timeStampGUI(firstName:String?){

    println("Tjenare $firstName i timeStamp ange två klockslag")
    var first = ""; var second = ""

    try{
        val (a,b) = readLine()!!.split(' ')
        first = a
        second = b
    }
    catch(e: IndexOutOfBoundsException){
        println("Fail")
    }

    if(validateInputIsTimeStamps(arrayOf(first, second)) == true){
        var logic = TimeLogic()
        println(logic.timeBetweenTimeStamps(first, second))
        println( "It's true")
        println("$first $second")
    }

    return
}



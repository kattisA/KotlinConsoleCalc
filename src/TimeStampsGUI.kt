import java.lang.IndexOutOfBoundsException

fun timeStampGUI(firstName:String?){
    println("Tjenare $firstName i timeStamp ange två klockslag")
    //println(validateTimeStamps(readLine()))
    var first = ""; var second = ""

    try{
        var(a,b) = readLine()!!.split(' ')
        first = a
        second = b
    }
    catch(e: IndexOutOfBoundsException){
        println("Fail")
    }

    if(validateInputIsTimeStamps(arrayOf(first, second)) == true){
        println( "It's true")
        println("$first $second")
    }

    return
}



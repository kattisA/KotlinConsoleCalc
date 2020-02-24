import java.lang.IndexOutOfBoundsException

fun timeStampGUI(firstName:String?){
    println("Tjenare $firstName i timeStamp ange två klockslag")
    //println(validateTimeStamps(readLine()))

    try{
        val(first, second ) = readLine()!!.split(' ')
        if(validateTimeStamps(arrayOf(first, second)) == true){
            println( "It's true")
            println("$first $second")
        }
    }
    catch(e: IndexOutOfBoundsException){
        println("Fail")
    }
   /* if(validateTimeStamps(readLine()) == "Success"){
        val(first, second ) = readLine()!!.split(' ')
        println("$first $second")
    } else{
        println("Fel inmatning!")
    }*/
    return
}



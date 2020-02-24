import java.lang.IndexOutOfBoundsException

fun validateTimeStamps(input: String?):String {
    return try{
        input!!.split(' ')
        "Success"
    }
    catch(e: IndexOutOfBoundsException){
        "Fail"
    }
}
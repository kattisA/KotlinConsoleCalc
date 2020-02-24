import java.lang.IndexOutOfBoundsException

fun validateTimeStamps(input: String?):String {
    return try{
        val(first, second )=input!!.split(' ')
        "Success"
    }
    catch(e: IndexOutOfBoundsException){
        "Fail"
    }
}


fun validateInputIsTimeStamps(inputs: Array<String>): Boolean? {
    return inputs.all { it.matches(Regex("[0-2][0-9]:[0-9][0-9]")) }

}


fun validateInputIsTimeStamps(inputs: Array<String>): Boolean? {
    return inputs.all { it.matches(Regex("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]")) }

}
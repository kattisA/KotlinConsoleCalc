import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertNotEquals

internal class ValidationKtTest{
    @ParameterizedTest
    @ValueSource(strings= ["adr", "3455","&%¤/"])
    internal fun `wrong user input returns false`(incorrectInput: String) {
        assertNotEquals(
            true,
            validateInputIsTimeStamps(arrayOf (incorrectInput))
        )
    }

    @ParameterizedTest
    @ValueSource(strings = ["34:00", "12:99", "1:00"])
    internal fun `wrong timestamps returns false`(incorrectTimeStamps: String) {
        assertNotEquals(
            true,
            validateInputIsTimeStamps(arrayOf(incorrectTimeStamps)))

    }
}


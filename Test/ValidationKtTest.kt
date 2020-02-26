import org.junit.jupiter.api.Test
import kotlin.test.assertNotEquals

internal class ValidationKtTest{
    @Test
    internal fun `wrong user input returns false`() {
        assertNotEquals(
            true,
            validateInputIsTimeStamps(arrayOf ("adr", "3445"))
        )
    }

    @Test
    internal fun `wrong timestamps returns false`() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


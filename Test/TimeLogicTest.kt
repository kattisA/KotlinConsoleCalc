import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TimeLogicTest{
    val logic = TimeLogic()
 @Test
 internal fun  `timeBetweenTimeStamps returns correct amount of time`(){
     assertEquals(2, logic.timeBetweenTimeStamps("12:00", "14:00"))
 }
}
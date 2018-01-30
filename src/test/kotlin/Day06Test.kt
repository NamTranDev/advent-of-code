import org.junit.Assert
import org.junit.Test
import utils.getInput

/**
 * Created by sagar on 30/01/18.
 */
class Day06Test {

    @Test
    fun `part 01 sample test`() {
        Assert.assertEquals(5, Day06.part1(getInput("day06sample.txt")))
    }

    @Test
    fun `part 01 actual test`(){
        Assert.assertEquals(12841, Day06.part1(getInput("day06.txt")))
    }

}
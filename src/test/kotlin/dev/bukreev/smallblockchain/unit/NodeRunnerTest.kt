package dev.bukreev.smallblockchain.unit

import com.github.stefanbirkner.systemlambda.SystemLambda.catchSystemExit
import dev.bukreev.smallblockchain.main
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NodeRunnerTest {
    @Test
    fun testEmptyArgs() {
        val code = catchSystemExit { main(emptyArray()) }
        assertEquals(127, code)
    }

    @Test
    fun testNotValidArgs() {
        val code = catchSystemExit { main(arrayOf("-a", "127.0.0.1:11116")) }
        assertEquals(127, code)
    }

    @Test
    fun testNotValidPort() {
        assertFailsWith<IndexOutOfBoundsException> { main(arrayOf("-a", "127.0.0.1:11116", "-o", "test")) }
    }
}
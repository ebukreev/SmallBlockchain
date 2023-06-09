package dev.bukreev.smallblockchain.unit

import dev.bukreev.smallblockchain.sha256
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UtilsTests {
    @Test
    fun testSha256() {
        val sha = sha256("abc")
        assertEquals(sha, "BA7816BF8F01CFEA414140DE5DAE2223B00361A396177A9CB410FF61F20015AD")
    }

    @Test
    fun testEmptySha256() {
        val sha = sha256("")
        assertEquals(sha, "E3B0C44298FC1C149AFBF4C8996FB92427AE41E4649B934CA495991B7852B855")
    }
}
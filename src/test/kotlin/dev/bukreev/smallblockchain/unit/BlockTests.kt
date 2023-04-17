package dev.bukreev.smallblockchain.unit

import dev.bukreev.smallblockchain.Block
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BlockTests {
    @Test
    fun testFirstBlock() {
        val firstBlock = Block.new(null)

        assertEquals(firstBlock.previousHash, "")
        assertEquals(firstBlock.index, 0)
        assertTrue { firstBlock.hash.endsWith("0000") }
    }

    @Test
    fun testSecondBlock() {
        val firstBlock = Block.new(null)
        val secondBlock = Block.new(firstBlock)

        assertEquals(secondBlock.previousHash, firstBlock.hash)
        assertEquals(secondBlock.index, 1)
        assertTrue { secondBlock.hash.endsWith("0000") }
    }

    @Test
    fun testThirdBlock() {
        val firstBlock = Block.new(null)
        val secondBlock = Block.new(firstBlock)
        val thirdBlock = Block.new(secondBlock)

        assertEquals(thirdBlock.previousHash, secondBlock.hash)
        assertEquals(thirdBlock.index, 2)
        assertTrue { thirdBlock.hash.endsWith("0000") }
    }
}
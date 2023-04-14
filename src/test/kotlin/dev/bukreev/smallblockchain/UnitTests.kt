package dev.bukreev.smallblockchain

import io.ktor.network.sockets.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class UnitTests {
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

    @Test
    fun testNodeNotifying() {
        val firstNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val secondNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val thirdNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))

        firstNode.notifyAboutOtherNodes(listOf(firstNode, secondNode, thirdNode).map { it.inboundAddress })

        assertEquals(firstNode.otherNodes.size, 2)
        assertEquals(firstNode.otherNodes[0], secondNode.inboundAddress)
        assertEquals(firstNode.otherNodes[1], thirdNode.inboundAddress)
    }

    @Test
    fun testSha256() {
        val sha = sha256("abc")
        assertEquals(sha, "BA7816BF8F01CFEA414140DE5DAE2223B00361A396177A9CB410FF61F20015AD")
    }
}
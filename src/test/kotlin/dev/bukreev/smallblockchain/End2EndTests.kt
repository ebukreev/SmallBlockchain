package dev.bukreev.smallblockchain

import io.ktor.network.sockets.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class End2EndTests {
    @Test
    fun test3Nodes() = runBlocking {
        val firstNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val secondNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val thirdNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))

        val allNodes = listOf(firstNode, secondNode, thirdNode)

        allNodes.forEach { it.notifyAboutOtherNodes(allNodes.map { it.inboundAddress }) }

        val firstGeneration = launch { firstNode.start(false) }
        val secondGeneration = launch { secondNode.start(true) }
        val thirdGeneration = launch { thirdNode.start(false) }

        delay(10000)

        firstGeneration.cancel()
        secondGeneration.cancel()
        thirdGeneration.cancel()

        assertEquals(firstNode.blocks[0], secondNode.blocks[0])
        assertEquals(firstNode.blocks[0], thirdNode.blocks[0])
        assertEquals(firstNode.blocks[1], secondNode.blocks[1])
        assertEquals(firstNode.blocks[1], thirdNode.blocks[1])
        assertEquals(firstNode.blocks[2], secondNode.blocks[2])
        assertEquals(firstNode.blocks[2], thirdNode.blocks[2])
    }
}
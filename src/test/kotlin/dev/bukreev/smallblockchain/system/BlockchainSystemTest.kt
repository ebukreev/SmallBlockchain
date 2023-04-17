package dev.bukreev.smallblockchain.system

import dev.bukreev.smallblockchain.Node
import dev.bukreev.smallblockchain.findFreePort
import io.ktor.network.sockets.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BlockchainSystemTest {
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

        delay(1000)

        firstGeneration.cancel()
        secondGeneration.cancel()
        thirdGeneration.cancel()

        for (i in 0 until minOf(firstNode.blocks.size, secondNode.blocks.size, thirdNode.blocks.size)) {
            assertEquals(firstNode.blocks[i], secondNode.blocks[i])
            assertEquals(firstNode.blocks[i], thirdNode.blocks[i])
        }
    }
}
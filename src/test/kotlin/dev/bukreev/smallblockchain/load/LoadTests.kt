package dev.bukreev.smallblockchain.load

import dev.bukreev.smallblockchain.Block
import dev.bukreev.smallblockchain.Node
import dev.bukreev.smallblockchain.findFreePort
import io.ktor.network.sockets.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class LoadTests {
    @Test
    fun testBlockGenerationTime() = runBlocking {
        val blocksSize = 10000
        val firstNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val secondNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val thirdNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))

        val allNodes = listOf(firstNode, secondNode, thirdNode)

        allNodes.forEach {
            it.notifyAboutOtherNodes(allNodes.map { it.inboundAddress })
            it.blocks.addAll(List(blocksSize) { Block(it, "", 0, "", "") })
        }

        val firstGeneration = launch { firstNode.start(false) }
        val secondGeneration = launch { secondNode.start(true) }
        val thirdGeneration = launch { thirdNode.start(false) }

        delay(1000)

        firstGeneration.cancel()
        secondGeneration.cancel()
        thirdGeneration.cancel()

        assert(firstNode.blocks.size >= blocksSize + 1)
        assert(secondNode.blocks.size >= blocksSize + 1)
        assert(thirdNode.blocks.size >= blocksSize + 1)
    }
}
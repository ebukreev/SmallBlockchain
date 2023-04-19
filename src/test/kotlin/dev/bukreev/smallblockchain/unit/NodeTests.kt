package dev.bukreev.smallblockchain.unit

import dev.bukreev.smallblockchain.Node
import dev.bukreev.smallblockchain.findFreePort
import io.ktor.network.sockets.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NodeTests {
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
}
package dev.bukreev.smallblockchain.stress

import dev.bukreev.smallblockchain.Block
import dev.bukreev.smallblockchain.Node
import dev.bukreev.smallblockchain.findFreePort
import io.ktor.network.sockets.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
class StressTests {
    @Test
    fun testBlockGenerationTime() {
        val blocksNum = 1000000
        val timeInMills = runBlocking {
            val firstNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
            val secondNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))
            val thirdNode = Node(InetSocketAddress("127.0.0.1", findFreePort()))

            val allNodes = listOf(firstNode, secondNode, thirdNode)

            allNodes.forEach {
                it.notifyAboutOtherNodes(allNodes.map { it.inboundAddress })
                it.blocks.addAll(List(blocksNum) { Block(it, "", 0, "", "") })
            }

            val firstGeneration = launch { firstNode.start(false) }
            val secondGeneration = launch { secondNode.start(true) }
            val thirdGeneration = launch { thirdNode.start(false) }

            val delta = 10L
            var time = 0L

            do {
                delay(delta)
                time += delta
            } while (!(firstNode.blocks.size >= blocksNum + 1 &&
                        secondNode.blocks.size >= blocksNum + 1 &&
                        thirdNode.blocks.size >= blocksNum + 1)
            )

            firstGeneration.cancel()
            secondGeneration.cancel()
            thirdGeneration.cancel()

            time
        }
        println("Result with $blocksNum blocks is $timeInMills mills")
    }
}
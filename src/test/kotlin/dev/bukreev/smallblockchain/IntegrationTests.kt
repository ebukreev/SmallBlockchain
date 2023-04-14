package dev.bukreev.smallblockchain

import io.ktor.network.sockets.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class IntegrationTests {
    @Test
    fun testStartWithoutGeneration() = runBlocking {
        val node = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val generation = launch {
            node.start(false)
        }
        delay(100)
        generation.cancel()
        assertTrue { node.blocks.isEmpty() }
    }

    @Test
    fun testStartWithGeneration() = runBlocking {
        val node = Node(InetSocketAddress("127.0.0.1", findFreePort()))
        val generation = launch {
            node.start(true)
        }
        delay(100)
        generation.cancel()
        assertTrue { node.blocks.isNotEmpty() }
        assertEquals(node.blocks[0].index, 0)
    }
}
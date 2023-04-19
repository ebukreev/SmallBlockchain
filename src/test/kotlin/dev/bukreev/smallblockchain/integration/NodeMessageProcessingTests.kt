package dev.bukreev.smallblockchain.integration

import dev.bukreev.smallblockchain.*
import io.ktor.network.selector.*
import io.ktor.network.sockets.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class NodeMessageProcessingTests {
    @Test
    fun testRequestBlocks(): Unit = runBlocking {
        val node = Node(InetSocketAddress("127.0.0.1", findFreePort()))

        val generation = launch { node.start(true) }
        delay(1000)

        suspend fun receiveBlock(): Block? {
            val socket = aSocket(SelectorManager(Dispatchers.IO))
                .tcp()
                .connect(node.inboundAddress)

            socket.openWriteChannel(autoFlush = true)
                .sendMessage(Message(MessageType.REQUEST_BLOCK, ""))

            return socket.openReadChannel()
                .receiveMessage().block
        }

        val firstBlock = receiveBlock()!!
        delay(1000)
        val secondBlock = receiveBlock()!!

        generation.cancel()

        assert(firstBlock.index < secondBlock.index)
        assert(firstBlock.hash.endsWith("0000"))
        assert(secondBlock.hash.endsWith("0000"))
    }
}
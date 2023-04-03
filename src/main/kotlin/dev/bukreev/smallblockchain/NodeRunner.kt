package dev.bukreev.smallblockchain

import io.ktor.network.sockets.*
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.required
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    val parser = ArgParser("Small Blockchain Node")
    val address by parser.option(
        ArgType.String,
        fullName = "address",
        shortName = "a",
        description = "Specify node address in format 127.0.0.1:11116"
    ).required()

    val otherNodes by parser.option(
        ArgType.String,
        fullName = "other",
        shortName = "o",
        description = "Specify other nodes addresses in format 127.0.0.1:11116,127.0.0.1:11117"
    ).required()

    val first by parser.option(
        ArgType.Boolean,
        fullName = "first",
        shortName = "f",
        description = "Generate first block"
    ).default(false)

    parser.parse(args)

    val node = Node(address.parseSocketAddress())
    node.notifyAboutOtherNodes(otherNodes.split(',').map { it.parseSocketAddress() })

    runBlocking {
        node.start(first)
    }
}

private fun String.parseSocketAddress(): SocketAddress =
    split(':')
    .let { InetSocketAddress(it[0], it[1].toInt()) }
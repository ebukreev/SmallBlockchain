package dev.bukreev.smallblockchain

import java.net.ServerSocket

fun findFreePort() = ServerSocket(0).use { it.localPort }
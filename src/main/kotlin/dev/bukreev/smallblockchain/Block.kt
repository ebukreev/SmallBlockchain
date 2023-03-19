package dev.bukreev.smallblockchain

class Block private constructor(
    val index: Int,
    val previousHash: String,
    val nonce: Int,
    val data: String,
    val hash: String,
)

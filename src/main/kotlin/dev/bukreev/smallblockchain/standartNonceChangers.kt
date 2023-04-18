package dev.bukreev.smallblockchain

typealias ChangeNonce = (Int) -> Int

val increment: ChangeNonce = { it + 1 }
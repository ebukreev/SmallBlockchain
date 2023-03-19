package dev.bukreev.smallblockchain

import kotlin.math.*
import kotlin.random.Random

typealias ChangeNonce = (Int) -> Int

val increment: ChangeNonce = { it + 1 }

val fibonacci: ChangeNonce = { (it * (1 + sqrt(5.0)) / 2.0).roundToInt() }

val random: ChangeNonce = { Random.nextInt() }
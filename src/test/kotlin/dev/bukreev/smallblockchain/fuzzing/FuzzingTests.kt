package dev.bukreev.smallblockchain.fuzzing

import com.code_intelligence.jazzer.api.FuzzedDataProvider
import com.code_intelligence.jazzer.junit.FuzzTest
import dev.bukreev.smallblockchain.Block
import dev.bukreev.smallblockchain.sha256

class FuzzingTests {
    @FuzzTest
    fun testBlockCreation(data: FuzzedDataProvider) {
        Block.new(
            Block(
                data.consumeInt(),
                data.consumeString(),
                data.consumeInt(),
                data.consumeString(),
                data.consumeString(),
            )
        )
    }

    @FuzzTest
    fun testSha256(data: FuzzedDataProvider) {
        sha256(data.consumeString())
    }

    private fun FuzzedDataProvider.consumeString() = consumeString(consumeInt(0, 512))
}
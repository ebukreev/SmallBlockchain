package dev.bukreev.smallblockchain.pbt

import dev.bukreev.smallblockchain.Block
import net.jqwik.api.ForAll
import net.jqwik.api.Property
import net.jqwik.api.constraints.Positive
import kotlin.test.assertEquals


class PropertyBasedBlockTests {
    @Property(tries = 100)
    fun testBlockCreation(
        @ForAll index: @Positive Int,
        @ForAll prevHash: String,
        @ForAll nonce: @Positive Int,
        @ForAll data: String,
        @ForAll hash: String
    ) {
       val block = Block.new(Block(index, prevHash, nonce, data, hash))

        assertEquals(block.index, index + 1)
        assertEquals(block.previousHash, hash)
        assert(block.hash.endsWith("0000"))
    }
}
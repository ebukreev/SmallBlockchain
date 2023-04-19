package dev.bukreev.smallblockchain.pbt

import dev.bukreev.smallblockchain.increment
import net.jqwik.api.ForAll
import net.jqwik.api.Property
import kotlin.test.assertEquals

class PropertyBasedNonceChangersTests {
    @Property
    fun testIncrementChanger(@ForAll int: Int) {
        assertEquals(increment(int), int + 1)
    }
}
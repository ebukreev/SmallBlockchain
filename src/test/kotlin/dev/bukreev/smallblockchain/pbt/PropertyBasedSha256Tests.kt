package dev.bukreev.smallblockchain.pbt

import dev.bukreev.smallblockchain.sha256
import net.jqwik.api.ForAll
import net.jqwik.api.Property
import net.jqwik.api.constraints.NotBlank
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PropertyBasedSha256Tests {
    @Property
    fun testSha256Determinism(@ForAll string: String) {
        assertEquals(sha256(string), sha256(string))
    }

    @Property
    fun testSha256NotRepeats(@ForAll string: String) {
        assertNotEquals(sha256(string), sha256(sha256(string)))
    }

    @Property
    fun testSha256NotBlank(@ForAll string: @NotBlank String) {
        assert(sha256(string).isNotBlank())
    }
}
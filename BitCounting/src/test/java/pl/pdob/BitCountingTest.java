package pl.pdob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitCountingTest {

    @Test
    void countBits() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}